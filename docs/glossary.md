# Glossary – EV Charging Network

> Source: FA1 submission *Glossary – Group 4* (based on Customer Needs V25.12).

**Consistency Rule:** Only the **Unique Terms** below shall be used throughout all project artifacts – User Story Map, User Stories, Acceptance Criteria (BDD scenarios), domain model, source code and documentation. The listed synonyms are documented strictly for traceability to the Customer Needs text and must not be used in project deliverables.

| Unique Term | Project Definition | Synonyms in Customer Needs |
|---|---|---|
| **EV Charging Network** | The entire infrastructure of interconnected charging Locations and Charging Points operated by the Owner (CPO) and managed by the software solution. | EV Charging Network, Ladenetzwerk, network with charging stations for electric vehicles, network |
| **Owner (CPO)** | The Charge Point Operator (private entrepreneur) who owns, manages, and monitors the EV Charging Network, configures Price Lists, and inspects Customer account activities. | private entrepreneur, CPO, owners |
| **Customer** | A registered end-user who tops up a prepaid Customer Account in advance in order to charge an electric vehicle at a Charging Point. | Customers, Customers of the charging units, Clients |
| **Location** | A physical site operated by the Owner (CPO) that typically houses several Charging Points and has its own Location-specific Price List. | locations, sites, charging stations, electric charging station, EV-Charging-Stations |
| **Charging Point** | An individual physical unit or bay at a Location where a single electric vehicle can connect and charge. Each Charging Point supports exactly one fixed Charging Mode (either AC or DC). | charging bays, charging points, Charge points (EVSE), EV-Charge-Points, charging units |
| **Charging Mode** | The fixed electrical current type supported by a Charging Point and utilized during a Charging Session, either Alternating Current (**AC**) or Direct Current (**DC**). | AC or DC type, charging mode (AC, DC), charging mode |
| **Operating Status** | The real-time technical availability state of an individual Charging Point, which must be one of three values: **Available**, **Occupied**, or **Out of Order**. | state ("available", "occupied" or "out of order"), operating status |
| **Network Status** | A real-time overview across all Locations in the EV Charging Network showing the currently valid Price List and the Operating Status of every individual Charging Point. | current status of the EV-Charging-Stations on the network |
| **Customer Account** | A mandatory prepaid user profile required to use the EV Charging Network, holding the Customer's prepaid credit and chronological Ledger. | accounts, prepaid system, client Account |
| **Registration** | The mandatory initial onboarding process through which an end-user creates a personal Customer Account before being able to top up credit or use any Charging Point. | Customers of the charging units must register |
| **Top-up** | A monetary deposit made by a Customer in advance to add prepaid credit to their Customer Account before starting a Charging Session. | top up, top-ups, deposits |
| **Charging Session** | A single continuous process of charging an electric vehicle at a Charging Point from start to end, billed based on Charging Mode, Charged Energy, and Charging Duration. | load energy, loading process, charging sessions |
| **Charged Energy** | The total amount of electrical energy transferred to an electric vehicle during a Charging Session, measured in kilowatt-hours (**kWh**). | charged energy (kWh), loaded energy |
| **Charging Duration** | The total time an electric vehicle occupies and uses a Charging Point during a Charging Session, measured in **minutes**. | charging time (minutes), duration of use |
| **Price List** | The set of four active tariffs defined per Location: energy price per kWh for AC, energy price per kWh for DC, parking price per minute for AC, and parking price per minute for DC. The prices valid at the start of a Charging Session apply for the entire session. | prices for the charging services, station prices, currently valid station prices |
| **Charging Cost** | The total monetary expense of a single Charging Session, calculated as: (Charged Energy × applicable kWh energy price) + (Charging Duration × applicable parking price per minute). | charging expenses, cumulated prices (kWh & parking) |
| **Ledger** | A date-sorted chronological history of all financial transactions on a Customer Account, listing both Top-ups and Charging Sessions (including Location name, Charging Point, Charging Mode, Charging Duration, Charged Energy, and Charging Cost) together with the resulting account balance. | client Account-Activity, transaction-history, EV-Charging-Ledger, balance |
