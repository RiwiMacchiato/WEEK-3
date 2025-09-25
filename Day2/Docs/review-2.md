### **Activity 1 – Basic interface**

1. Create an interface `Operable` with `void start()` and `void stop()`.
2. Implement `Operable` in `Engine` and `Fan`.
3. In `main`, store both in an `ArrayList<Operable>` and loop through calling `start()` and `stop()`.

---

### **Activity 2 – Interface with return value**

1. Create an interface `Calculable` with `double calculate(double a, double b)`.
2. Implement `Addition` and `Multiplication`.
3. In `main`, use an `ArrayList<Calculable>` and run `calculate(3,4)` for each implementation.

---

### **Activity 3 – Abstract + polymorphism**

1. Create `abstract class Shape` with `abstract double area()`.
2. Create `Square(side)` and `Circle(radius)` extending `Shape`.
3. In `main`, put 3–4 shapes into an `ArrayList<Shape>` and print each `area()`.

---

### **Activity 4 – Abstract with template**

1. Create `abstract class Process` with `final void execute()` that calls `prepare()`, `process()`, `finish()`.
2. Declare `abstract void prepare()` and `process()`, and a concrete `finish()` that prints “OK”.
3. Implement `CsvProcess` and `JsonProcess`. Test `execute()` for both.

---

### **Activity 5 – Catalog with ArrayList**

1. Create `Product(id:String, name:String, price:double)`.
2. In `main`, use an `ArrayList<Product>`: add 5, remove 1 by index, update the name of the first.
3. Loop and print `id - name - price`.

---

### **Activity 6 – Index with HashMap**

1. Given an `ArrayList<String> words`, build a `HashMap<String,Integer>` with frequencies.
2. Print the keys and their counts.
3. If a word appears more than 2 times, mark it with “\*” when printing.

---

### **Activity 7 – Interface + HashMap**

1. Create `interface Storable { String key(); }`.
2. Create `User(id:String, name:String)` implementing `Storable` (key = id).
3. In `main`, store users in a `HashMap<String, User>` using `u.key()`.
4. Find, update the name by id, and remove a user.

---

### **Activity 8 – Abstract + filter with ArrayList**

1. `abstract class Document { String title; abstract int pages(); }`
2. `Book(title, pages)` and `Magazine(title, pagesPerEdition)`.
3. In `main`, an `ArrayList<Document>` and print only those with `pages() ≥ 100`.

---

### **Activity 9 – Strategies (interface)**

1. `interface Formatter { String format(String s); }`
2. Implement `UpperCase`, `LowerCase`, `TitleCase` (capitalize first letter of each word).
3. In `main`, use an `ArrayList<Formatter>` and apply each strategy to the same string.

---

### **Activity 10 – Simple router with HashMap**

1. `HashMap<String, Runnable>` mapping `"/home"`, `"/about"`, `"/contact"` to `Runnable`s that print messages.
2. In `main`, simulate 3 “requests” by looking up the key and running the `Runnable`.
3. If the route doesn’t exist, print “404”.

---

### **Activity 11 – Mixed workshop (abstract + interface + collections)**

1. `abstract class Employee { String id; String name; abstract double monthlySalary(); }`
2. `interface Bonusable { double bonus(); }`
3. Create `FullTimeEmployee(baseSalary)` implementing `Bonusable` (10% bonus).
4. Create `HourlyEmployee(hours, rate)` without bonus.
5. In `main`, `ArrayList<Employee>` with several; calculate total salaries and add bonus if applicable.
6. Print the total.

---

### **Activity 12 – Bilingual dictionary (HashMap\<String, ArrayList<String>>)**

1. `HashMap<String, ArrayList<String>> dictionary` (key = Spanish word, value = list of translations).
2. Add 3 words with 2–3 translations each.
3. Add a new translation to an existing word.
4. Print all words and their translations in format `word: t1, t2, t3`.

---

### **Activity 13 – In-memory repository (interface + HashMap)**

1. `interface Repo<T> { void save(T t); T findById(String id); void delete(String id); }`
2. `class Student { String id; String name; }`
3. `class StudentRepo implements Repo<Student>` using `HashMap<String, Student>`.
4. In `main`, save 3 students, get 1 by id, delete 1, and list the rest.

---

### **Activity 14 – Basic filtering and sorting with ArrayList**

1. Create `Task(id, title, priority:int)`.
2. In `main`, `ArrayList<Task>` with 6 tasks (different priorities).
3. Filter tasks with priority ≥ 3 into a new list.
4. Sort the new list by ascending priority and print it.

---

### **Activity 15 – Abstract with validation**

1. `abstract class Account { String number; double balance; abstract boolean withdraw(double amount); }`
2. `SavingsAccount` (cannot go below 0).
3. `CreditAccount` (can go negative up to -1000).
4. In `main`, `ArrayList<Account>` and test valid/invalid withdrawals.