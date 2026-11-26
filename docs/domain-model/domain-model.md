# Domain Model (MVP)

Minimal domain model for the MVP User Stories. Class names are Unique Terms from the [Glossary](../glossary.md).
Backlog stories (e.g. reservations, price history) extend the model later – keep this version for the FA10 reflection (original vs. actual).

```mermaid
classDiagram
direction TB

class Main {
  -LocationManager locationManager
  -CustomerManager customerManager
  +main(String[] args)$ void
}

class LocationManager {
  -List~Location~ locations
  +createLocation(String name) Location
  +getLocation(String name) Location
  +getLocations() List~Location~
  +getNetworkStatus() String
}
class Location {
  -String name
  -List~ChargingPoint~ chargingPoints
  -PriceList priceList
  +addChargingPoint(String id, ChargingMode mode) ChargingPoint
  +getChargingPoint(String id) ChargingPoint
  +setPriceList(PriceList priceList) void
}
class ChargingPoint {
  -String id
  -ChargingMode chargingMode
  -OperatingStatus operatingStatus
  +setOperatingStatus(OperatingStatus status) void
  +isAvailable() boolean
}
class PriceList {
  -BigDecimal energyPriceAc
  -BigDecimal energyPriceDc
  -BigDecimal parkingPriceAc
  -BigDecimal parkingPriceDc
  +getEnergyPrice(ChargingMode mode) BigDecimal
  +getParkingPrice(ChargingMode mode) BigDecimal
}
class ChargingMode {
  <<enumeration>>
  AC
  DC
}
class OperatingStatus {
  <<enumeration>>
  AVAILABLE
  OCCUPIED
  OUT_OF_ORDER
}

class CustomerManager {
  -List~Customer~ customers
  +registerCustomer(String name) Customer
  +getCustomer(String name) Customer
  +getCustomers() List~Customer~
}
class Customer {
  -String name
  -BigDecimal balance
  -List~LedgerEntry~ ledger
  +topUp(BigDecimal amount) void
  +startChargingSession(Location location, ChargingPoint chargingPoint) ChargingSession
  +endChargingSession(ChargingSession session, double chargedEnergy, int chargingDuration) void
  +getBalance() BigDecimal
  +getLedger() List~LedgerEntry~
}
class LedgerEntry {
  <<abstract>>
  -LocalDateTime timestamp
  +getAmount()* BigDecimal
}
class TopUp {
  -BigDecimal amount
  +getAmount() BigDecimal
}
class ChargingSession {
  -Location location
  -ChargingPoint chargingPoint
  -BigDecimal energyPrice
  -BigDecimal parkingPrice
  -double chargedEnergy
  -int chargingDuration
  +getChargingCost() BigDecimal
  +getAmount() BigDecimal
}

Main *-- LocationManager
Main *-- CustomerManager
LocationManager "1" *-- "0..*" Location
Location "1" *-- "1..*" ChargingPoint
Location "1" *-- "1" PriceList
ChargingPoint --> ChargingMode
ChargingPoint --> OperatingStatus
CustomerManager "1" o-- "0..*" Customer
Customer "1" o-- "0..*" LedgerEntry : Ledger
LedgerEntry <|-- TopUp
LedgerEntry <|-- ChargingSession
ChargingSession --> "1" Location
ChargingSession --> "1" ChargingPoint
```

## Notes

- **Customer Account** (glossary) = `balance` + `ledger` of `Customer`; no separate class needed.
- **Ledger** = the Customer's list of Top-ups and Charging Sessions in the order they happened (date-sorted).
- **Price List valid at the start applies:** `startChargingSession` copies the energy and parking price of the Location's Price List into the `ChargingSession`.
- **Charging Cost** = Charged Energy × energy price + Charging Duration × parking price; `endChargingSession` deducts it from the balance (C-13) and sets the Charging Point back to Available.
- **Network Status** (O-12, C-08) = `LocationManager.getNetworkStatus()`: Price List and Operating Status of every Charging Point per Location.
