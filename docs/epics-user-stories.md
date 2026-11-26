# Epics & User Stories

> Source: FA3 submission *Epics-UserStories_Group4.pdf*. Each Epic corresponds to one activity (backbone) of a persona in the User Story Map and to one BDD feature file. Each User Story corresponds to exactly one task of the User Story Map (IDs C-xx / O-xx are identical to the map).

## Overview

| Epic | Persona | Title | User Stories | Feature file |
|---|---|---|---|---|
| E-C1 | Customer | Get Started | C-01, C-02, C-03, C-04, C-05, C-06, C-07 | `ec1_get_started.feature` |
| E-C2 | Customer | Find Charging Point | C-08, C-09 | `ec2_find_charging_point.feature` |
| E-C3 | Customer | Charge Vehicle | C-10, C-11, C-12, C-13, C-14 | `ec3_charge_vehicle.feature` |
| E-C4 | Customer | Review Account | C-15, C-16 | `ec4_review_account.feature` |
| E-O1 | Owner | Manage Network | O-01, O-02, O-03, O-04, O-05, O-06, O-07 | `eo1_manage_network.feature` |
| E-O2 | Owner | Manage Pricing | O-08, O-09, O-11 | `eo2_manage_pricing.feature` |
| E-O3 | Owner | Monitor Network | O-12, O-13 | `eo3_monitor_network.feature` |
| E-O4 | Owner | Manage Customers | O-14, O-15, O-16, O-17 | `eo4_manage_customers.feature` |

## Epic E-C1: Get Started

_As Customer, I want to register and manage my Customer Account and its prepaid credit, so that I can pay for Charging Sessions in advance._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| C-01 | As Customer, I want to register a Customer Account, so that I am allowed to use the EV Charging Network. | MVP | IA6 |
| C-02 | As Customer, I want to manage my Customer Account, so that I stay in control of my personal data. | Backlog | FA9 |
| C-03 | As Customer, I want to update my Customer Account, so that my personal data stays correct. | Backlog | FA9 |
| C-04 | As Customer, I want to top up my Customer Account, so that I have prepaid credit to start Charging Sessions. | MVP | IA7 |
| C-05 | As Customer, I want to view my Balance, so that I know how much prepaid credit I have left for charging. | MVP | IA7 |
| C-06 | As Customer, I want to set up an automatic Top-up, so that my Customer Account does not run out of prepaid credit. | Backlog | FA9 |
| C-07 | As Customer, I want to withdraw unused prepaid credit from my Customer Account, so that my money is not locked in the system. | Backlog | FA9 |

## Epic E-C2: Find Charging Point

_As Customer, I want to find a suitable Charging Point, so that I know where I can charge my vehicle and at which prices._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| C-08 | As Customer, I want to view the Network Status (Price List, Available Charging Points), so that I can see the currently valid prices and which Charging Points are Available. | MVP | IA7 |
| C-09 | As Customer, I want to search for a Location, so that I can quickly find a suitable place to charge. | Backlog | FA9 |

## Epic E-C3: Charge Vehicle

_As Customer, I want to charge my vehicle at a Charging Point, so that my vehicle is charged and the Charging Cost is settled from my prepaid credit._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| C-10 | As Customer, I want to start a Charging Session at an Available Charging Point, so that I can charge my vehicle. | MVP | IA7 |
| C-11 | As Customer, I want to reserve a Charging Point, so that it is still Available when I arrive. | Backlog | FA9 |
| C-12 | As Customer, I want to end a Charging Session, so that charging stops and the Charging Cost is determined. | MVP | IA7 |
| C-13 | As Customer, I want to pay the Charging Cost from my prepaid credit, so that the Charging Session is settled and my Balance is up to date. | MVP | IA7 |
| C-14 | As Customer, I want to receive a Charging Session summary, so that I can see the Charged Energy, Charging Duration and Charging Cost of my Charging Session. | Backlog | FA9 |

## Epic E-C4: Review Account

_As Customer, I want to review my Customer Account activity, so that I can keep track of my Top-ups and Charging Costs._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| C-15 | As Customer, I want to view my Ledger (Top-ups, Charging Sessions, Balance), so that I can follow all transactions on my Customer Account and see my current Balance. | MVP | IA7 |
| C-16 | As Customer, I want to export my Ledger, so that I can keep records of my Top-ups and Charging Costs outside the system. | Backlog | FA9 |

## Epic E-O1: Manage Network

_As Owner, I want to manage Locations and their Charging Points, so that the EV Charging Network is correctly represented and can grow._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| O-01 | As Owner, I want to create a Location, so that I can extend the EV Charging Network. | MVP | IA6 |
| O-02 | As Owner, I want to view all Locations, so that I have an overview of my EV Charging Network. | MVP | IA6 |
| O-03 | As Owner, I want to manage Locations, so that the data of my Locations stays up to date. | Backlog | FA9 |
| O-04 | As Owner, I want to remove a Location, so that closed Locations no longer appear in the EV Charging Network. | Backlog | FA9 |
| O-05 | As Owner, I want to add a Charging Point (AC/DC) to a Location, so that Customers can charge at the Location with the respective Charging Mode. | MVP | IA6 |
| O-06 | As Owner, I want to update the Operating Status of a Charging Point (Available, Occupied, Out of Order), so that the Network Status reflects the actual state of the Charging Point. | MVP | IA6 |
| O-07 | As Owner, I want to remove a Charging Point from a Location, so that decommissioned Charging Points are no longer offered to Customers. | Backlog | FA9 |

## Epic E-O2: Manage Pricing

_As Owner, I want to manage the Price List of each Location, so that Customers are billed correctly with up-to-date prices._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| O-08 | As Owner, I want to set the Price List of a Location, so that Charging Sessions at this Location are billed with the correct energy and parking prices. | MVP | IA7 |
| O-09 | As Owner, I want to view the price history of a Location, so that I can trace which Price List applied to past Charging Sessions. | Backlog | FA9 |
| O-11 | As Owner, I want to schedule a future price change for a Location, so that a new Price List becomes valid at a planned time without manual action. | Backlog | FA9 |

## Epic E-O3: Monitor Network

_As Owner, I want to monitor the EV Charging Network, so that I always know the state of my Locations and Charging Points._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| O-12 | As Owner, I want to view the Network Status, so that I can see the currently valid Price List and the Operating Status of every Charging Point. | MVP | IA7 |
| O-13 | As Owner, I want to filter the Network Status by Operating Status, so that I can quickly find, e.g., all Charging Points that are Out of Order. | Backlog | FA9 |

## Epic E-O4: Manage Customers

_As Owner, I want to manage Customers and inspect their Customer Account activity, so that I can bill correctly and keep an overview of my Customers._

| ID | User Story | Release | Milestone |
|---|---|---|---|
| O-14 | As Owner, I want to view the registered Customers, so that I know who uses my EV Charging Network. | MVP | IA6 |
| O-15 | As Owner, I want to manage Customers, so that I can keep the Customer Accounts under control. | Backlog | FA9 |
| O-16 | As Owner, I want to view the Ledger and Balance of a Customer, so that I can verify the Top-ups and Charging Costs of that Customer. | MVP | IA7 |
| O-17 | As Owner, I want to view the revenue per Location, so that I can evaluate how profitable each Location is. | Backlog | FA9 |

Note: O-10 is not used (gap in the numbering of the User Story Map).
