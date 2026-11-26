# Requirements checklist (Anforderungen-Checkliste)

Maps every course requirement (Moodle REQEP WS2026, Customer Needs V25.12, assessment criteria) to the repository element or issue that covers it.
Status as of **2026-11-26**: ✅ done · ⏳ open (tracked in an issue) · ⚠️ needs a decision / input.

Project board: [REQEP Group 4 – EV Charging Network](https://github.com/users/Manuel449-creator/projects/2) · Milestones: [all deliverables](https://github.com/Manuel449-creator/reqep-ev-charging-network-group4/milestones)

## FA4 – GitHub Project Collaboration Base (due 2026-12-09)

| Requirement | Covered by | Status |
|---|---|---|
| Create a **public** GitHub repository for the team project | this repository (public) | ✅ |
| Invite team members + lecturer to the repository | #33 – `wi25b065`, `wi25b019` (collaborators, write); lecturer `robert-jonas-technikum-wien-at` invited | ✅ (lecturer invitation pending) |
| Create a new GitHub project using the **Kanban template** | Project #2 (Kanban template: Backlog / Ready / In progress / In review / Done), linked to the repository, public | ✅ |
| Insert all User Stories into the Backlog | 32 User Story issues #1–#32 (= all tasks of the User Story Map / FA3) | ✅ |
| Move high-priority User Stories into *Ready* | IA6 stories #1, #17, #18, #21, #22, #29 in *Ready*; #35 | ✅ |
| Team members select User Stories and work on them | README → Workflow, issue/PR templates | ✅ |
| Link IntelliJ IDEA to the repository | #34 | ⏳ |
| Submit the repository link in Moodle | #36 | ⏳ |

## FA5 – Domain Model Diagram (due 2026-12-09)

| Requirement | Covered by | Status |
|---|---|---|
| Business domain objects with attributes & methods and relations (generalization, association, aggregation, composition) | #37, `docs/domain-model/` | ✅ |
| Management classes and main class in the diagram | #37 (`LocationManager`, `CustomerManager`, `Main`) | ✅ |
| UML class diagram in Modelio, exported as `Domain-Model_<group-id>.pdf` | `docs/domain-model/Domain-Model_Group4.pdf`; Moodle submission #38 | ⏳ submit in Moodle |

## IA6 – BDD MVP Part 1, static (due 2026-12-09)

| Requirement | Covered by | Status |
|---|---|---|
| IntelliJ Maven project with Cucumber (archetype setup) | `pom.xml`, `RunCucumberTest`, shared run configurations in `.run/`; build verified with JDK 27 (#39) | ✅ |
| Feature files **epic-wise** | 8 feature files in `src/test/resources/at/technikum/evcharging/features/` (one per Epic E-C1 … E-O4) | ✅ skeleton |
| Scenarios (acceptance criteria) for each static User Story, **≥ 2 per step task** | #1 C-01, #17 O-01, #18 O-02, #21 O-05, #22 O-06, #29 O-14 | ⏳ |
| Examples: 10 Locations, 2–5 Charging Points per Location, 5 Customers | #40 | ⏳ |
| Step definitions (test code), business objects, management classes | DoD of every User Story issue; packages `steps`, `model`, `management` | ⏳ |
| Main program showcases business logic independently of step definitions | `Main.java`, #41 | ⏳ |
| Submission `Project-MVP1_<group-id>.zip` | #42 | ⏳ |

## IA7 – BDD MVP Part 2, dynamic (due 2027-01-11)

| Requirement | Covered by | Status |
|---|---|---|
| Station pricing | #24 O-08 | ⏳ |
| Vehicle charging (incl. prepaid Top-up and payment) | #4 C-04, #5 C-05, #10 C-10, #12 C-12, #13 C-13 | ⏳ |
| Network status | #8 C-08, #27 O-12 | ⏳ |
| Transaction history (Ledger) | #15 C-15, #31 O-16 | ⏳ |
| Main program updated | #43 | ⏳ |
| Submission `Project-MVP2_<group-id>.zip` | #44 | ⏳ |

## FA8 – User Story Map Final (due 2027-01-25)

| Requirement | Covered by | Status |
|---|---|---|
| Updated User Story Map with all requirements, exported PDF | #45, `docs/user-story-map/` | ⏳ |

## FA9 – BDD Final Release (due 2027-01-25)

| Requirement | Covered by | Status |
|---|---|---|
| All requirements of the project (incl. backlog stories) | #2, #3, #6, #7, #9, #11, #14, #16, #19, #20, #23, #25, #26, #28, #30, #32 | ⏳ |
| **≥ 2 error or edge case Scenarios per feature file** | #46–#53 (one issue per feature file) | ⏳ |
| All requirements tested | Definition of Done (README, issue template) | ⏳ |
| Complete main program | #54 | ⏳ |
| Submission `Project-Final<group-id>.zip` | #56 | ⏳ |

## FA10 – Final presentation (due 2027-01-25, presented 2027-01-26)

| Requirement | Covered by | Status |
|---|---|---|
| User Story Map final, two sample feature files (station pricing, customer transaction history), live demo | #57 | ⏳ |
| Written reflection: Glossary, Requirements, Design, Collaboration (GitHub Project!), Coding, Summary | #58 | ⏳ |
| Submission `Project-Presentation-Final<group-id>.pdf` | #59, `docs/presentation/` | ⏳ |

## Already submitted (2026-11-25)

| Deliverable | In the repository |
|---|---|
| FA1 Glossary | `docs/glossary.md` (17 unique terms) |
| IA2 User Story Map MVP | basis of issues #1–#32 (same IDs C-xx / O-xx) |
| FA3 Epics & User Stories | `docs/epics-user-stories.md`, epic labels, feature files |

## Customer needs → User Stories

| Customer need (V25.12) | User Stories |
|---|---|
| Manage Locations and Charging Points (AC/DC; Available / Occupied / Out of Order) | O-01 – O-07 (#17–#23) |
| Customers must register | C-01 (#1) |
| Prepaid system: top up before charging | C-04 (#4), C-05 (#5) |
| Billing by Charging Mode, Charged Energy (kWh), Charging Duration (minutes) | C-12 (#12), C-13 (#13) |
| Prices (kWh AC/DC, parking per minute per mode) per Location, changeable any time; price at start of session applies | O-08 (#24), O-09 (#25), O-11 (#26) |
| Network Status list: valid prices + Operating Status per Location | C-08 (#8), O-12 (#27) |
| Ledger: date-sorted Top-ups and Charging Sessions with details and balance | C-15 (#15), O-16 (#31) |
| Developed BDD style | repository structure, feature files per Epic, Definition of Done |

## Cross-cutting requirements & assessment criteria

| Requirement | Covered by | Status |
|---|---|---|
| Use glossary terms consistently in all artifacts | `docs/glossary.md`, issue/PR templates, #55 | ⏳ |
| All assignments in English | README, docs, issues and templates in English | ✅ |
| Correctness & completeness | milestones per deliverable, this checklist | ⏳ |
| Readability & maintainability of source code | PR template checklist, review before merge | ⏳ |
| No GUI, persistent storage or security needed | README (scope) | ✅ |

## Open points

1. **Lecturer invitation** is pending until the lecturer accepts it (#33). Collaborators of a personal repository cannot get the admin role; only the owner can change repository settings.
2. **Build:** `mvn test` and the main program run with Oracle OpenJDK 27 (Cucumber 8.1.0, JUnit 6.1.3, release 21). Every team member still opens the project in IntelliJ once (#34).
3. **MVP split:** C-04 Top-up and C-05 View Balance were assigned to IA7 (dynamic, part of the Ledger). Move them to IA6 if the team sees them as static Customer data.
4. **Miro board:** the header still says "Group [Group ID]"; O-10 is missing in the numbering (fix both for FA8, #45).
5. Only Markdown versions of FA1/FA3 are in the repository, not the submitted PDFs.
