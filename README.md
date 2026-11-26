# EV Charging Network – REQEP Group 4

Course project for **Requirements Engineering Project (REQEP), WS 2026**, FH Technikum Wien.
We develop a software solution for the customer needs *"EV Charging Network"* in **Behavior-Driven Development (BDD)** style:
requirements are written as Gherkin feature files, verified by Cucumber step definitions and implemented as plain Java business domain objects.

## Team

| Member | GitHub |
|---|---|
| Konstantin Mikula | _tbd_ |
| Christopher Schramme | _tbd_ |
| Manuel Wagner | [@Manuel449-creator](https://github.com/Manuel449-creator) |

## Customer needs (summary)

The Owner (CPO) operates an EV Charging Network with currently 10 Locations, each with 2 to 5 Charging Points (AC or DC, Operating Status *Available*, *Occupied* or *Out of Order*). Customers must register and top up their prepaid Customer Account before charging. A Charging Session is billed by Charging Mode, Charged Energy (kWh) and Charging Duration (minutes) using the Price List of the Location that was valid at the start of the session. Owner and Customers can view the Network Status (prices and Operating Status per Location) and the Ledger (date-sorted Top-ups and Charging Sessions with balance) at any time.

No GUI, persistent storage or security is required – the system consists of Java business domain objects, management classes, a main program and automated acceptance tests.

All terms used in this repository follow the **[Glossary](docs/glossary.md)**.

## Tech stack

- Java 21+ (latest Oracle OpenJDK recommended), Maven
- Cucumber (Gherkin feature files, Java step definitions) on the JUnit Platform
- IntelliJ IDEA with the plugins *Cucumber for Java* and *Gherkin*

## Getting started

1. Clone the repository and open it in IntelliJ IDEA (*File → Open → pom.xml → Open as Project*).
2. Run all acceptance tests: right-click `RunCucumberTest` → *Run*, or on the command line:
   ```bash
   mvn test
   ```
3. Run the main program (`at.technikum.evcharging.Main`) from IntelliJ, or:
   ```bash
   mvn compile exec:java
   ```

## Project structure

```
src/main/java/at/technikum/evcharging/
├── Main.java                 main program (demo of the business logic)
├── model/                    business domain objects
└── management/               management classes
src/test/java/at/technikum/evcharging/
├── RunCucumberTest.java      Cucumber test suite
└── steps/                    step definitions (test code)
src/test/resources/at/technikum/evcharging/features/
└── *.feature                 one feature file per Epic
docs/
├── glossary.md               FA1 – unique terms (use them everywhere!)
├── epics-user-stories.md     FA3 – Epics & User Stories
├── user-story-map/           IA2 / FA8 – User Story Map exports
├── domain-model/             FA5 – Domain Model Diagram (Modelio)
├── presentation/             FA10 – final presentation
└── anforderungen-checkliste.md  course requirements → repository/issue mapping
```

## Requirements: Epics → feature files

Each Epic corresponds to one activity of the User Story Map and to exactly one feature file. Details: [docs/epics-user-stories.md](docs/epics-user-stories.md).

| Epic | Persona | Title | User Stories | Feature file |
|---|---|---|---|---|
| E-C1 | Customer | Get Started | C-01 – C-07 | `ec1_get_started.feature` |
| E-C2 | Customer | Find Charging Point | C-08, C-09 | `ec2_find_charging_point.feature` |
| E-C3 | Customer | Charge Vehicle | C-10 – C-14 | `ec3_charge_vehicle.feature` |
| E-C4 | Customer | Review Account | C-15, C-16 | `ec4_review_account.feature` |
| E-O1 | Owner (CPO) | Manage Network | O-01 – O-07 | `eo1_manage_network.feature` |
| E-O2 | Owner (CPO) | Manage Pricing | O-08, O-09, O-11 | `eo2_manage_pricing.feature` |
| E-O3 | Owner (CPO) | Monitor Network | O-12, O-13 | `eo3_monitor_network.feature` |
| E-O4 | Owner (CPO) | Manage Customers | O-14 – O-17 | `eo4_manage_customers.feature` |

## Deliverables & deadlines

Each deliverable is a GitHub milestone; the matching issues are tracked on the project's Kanban board.

| Deliverable | Content | Due (23:59) | Points |
|---|---|---|---|
| FA1 / IA2 / FA3 | Glossary, User Story Map MVP, Epics & User Stories | 2026-11-25 ✅ submitted | 5 / 15 / 10 |
| FA4 | GitHub Project Collaboration Base | 2026-12-09 | 5 |
| FA5 | Domain Model Diagram (UML, Modelio → PDF) | 2026-12-09 | 5 |
| IA6 | BDD MVP Part 1 – static: Locations, Charging Points, Customers | 2026-12-09 | 10 |
| IA7 | BDD MVP Part 2 – dynamic: pricing, charging, Network Status, Ledger | 2027-01-11 | 15 |
| FA8 | User Story Map Final | 2027-01-25 | 10 |
| FA9 | BDD Final Release incl. ≥ 2 error/edge cases per feature file | 2027-01-25 | 15 |
| FA10 | Final presentation (10 min) | 2027-01-25 | 10 |

Final presentations: **2027-01-26** (in class).

## Workflow

- **Kanban board:** GitHub Project with the columns *Backlog → Ready → In progress → In review → Done*. Pick a User Story from *Ready*, assign yourself and move it to *In progress*.
- **Branches:** `main` always builds and all tests pass. Work on `feature/<issue-number>-<short-name>` (e.g. `feature/12-create-location`).
- **Commits:** short imperative English messages, reference the issue (e.g. `Add Location management (#12)`).
- **Pull requests:** open a PR into `main`, link the issue with `Closes #<number>`, let a teammate review, then merge.
- **Definition of Done for a User Story:**
  - Scenarios (acceptance criteria) in the Epic's feature file, using glossary terms
  - Step definitions implemented, all Cucumber tests green
  - Business domain objects / management classes implemented
  - Main program shows the new behaviour
  - Reviewed and merged into `main`
- **Language:** everything in English (course requirement).
