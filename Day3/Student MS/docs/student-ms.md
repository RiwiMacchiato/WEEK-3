# Student M.S.

Imagine you are building a small **student management system**.
Right now, there is no database connected, so all the information will be stored **in memory**.

The company wants a structure that looks as close as possible to how data will later be handled with a real database through JDBC. For that reason:

* Every **student** must inherit from a more **generic person** type.
* The system must expose a **contract (interface)** that defines the basic operations to manage the information.
* The data must be organized in such a way that it can be stored, retrieved, and listed efficiently (think of collections like lists and maps).
* The repository should allow adding new students, finding them by their ID, removing them, and listing all of them.

At the end, you should be able to:

* Create several students in memory.
* Store them in your repository.
* Query them by ID or see them all together.
* Simulate simple operations that later, with JDBC, will correspond to **insert**, **select**, **delete**, and **select all** queries.
