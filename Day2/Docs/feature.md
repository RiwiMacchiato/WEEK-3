## **Feature: Advanced OOP with Interfaces, Abstract Classes, and Collections**

**Description:**
The system should enable practicing advanced OOP concepts by defining interfaces, implementing abstract classes, and managing collections with `ArrayList` and `HashMap`. Students will build examples where they apply contracts through interfaces, enforce rules via abstract classes, store and retrieve data using collections, and simulate behaviors similar to data repositories. These activities prepare the foundation for working with databases and JDBC.

**Acceptance Criteria:**

* **Scenario:** Implement an interface
  **Given** an interface with defined methods
  **When** I implement it in multiple classes
  **Then** I can store the objects in an `ArrayList` and invoke their methods through the interface type.

* **Scenario:** Use an abstract class with polymorphism
  **Given** an abstract class with an abstract method
  **When** I extend it in different subclasses
  **Then** each subclass provides its own implementation and the method works polymorphically when called in a collection.

* **Scenario:** Manage a catalog with `ArrayList`
  **Given** a list of custom objects
  **When** I add, remove, or update elements
  **Then** the changes are reflected when I iterate and print the list.

* **Scenario:** Store and retrieve with `HashMap`
  **Given** a `HashMap` with key-value pairs
  **When** I add elements and search by key
  **Then** I can retrieve, update, or delete the correct values.

* **Scenario:** Simulate a repository in memory
  **Given** an interface defining CRUD-like operations
  **When** I implement it with a `HashMap` for storage
  **Then** I can save objects, find them by ID, delete them, and list all of them through the repository.
