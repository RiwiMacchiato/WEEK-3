## **Feature: Student M.S.**

**Description:**
The system should simulate a simple in-memory repository for managing students, as preparation for working with JDBC. Students will design an abstract base class, extend it with a student entity, define a repository interface, and implement it using collections such as `HashMap` and `ArrayList`. The repository must allow creating, retrieving, deleting, and listing students, mimicking the core operations of a database layer.

**Acceptance Criteria:**

* **Scenario:** Create and extend an abstract class
  **Given** an abstract class representing a generic person
  **When** I extend it with a student class
  **Then** the student contains additional attributes and overrides its abstract method.

* **Scenario:** Define a repository interface
  **Given** an interface specifying CRUD-like operations
  **When** I implement the interface
  **Then** it defines methods to save, find by ID, delete, and list all students.

* **Scenario:** Implement repository with HashMap
  **Given** a repository implementation backed by a `HashMap`
  **When** I save multiple students
  **Then** they are stored with their IDs as keys and can be retrieved correctly.

* **Scenario:** Return results as a list
  **Given** students stored in the repository
  **When** I call the method to list all
  **Then** I get an `ArrayList` containing all current students.

* **Scenario:** Mimic database operations
  **Given** the in-memory repository
  **When** I insert, query, and delete students
  **Then** the behavior corresponds to `INSERT`, `SELECT`, and `DELETE` operations in a real database.
