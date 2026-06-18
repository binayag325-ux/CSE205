# List of Programs

## 1. Smart Warehouse (Inheritance & Interfaces)

### Concepts:
- Inheritance
- Abstract Class
- Interface
- Method Overriding

### Description:
Created an abstract class `StorageUnit` with ID and capacity.
The `ColdBox` class extends `StorageUnit` and implements the `Refrigerated` interface.
It allows temperature adjustment for refrigerated storage units.

Files:
- StorageUnit.java
- Refrigerated.java
- ColdBox.java
- Main.java

---

## 2. Student Grade Filter (ArrayList & Conditionals)

### Concepts:
- ArrayList
- For-each Loop
- If-Else Conditions

### Description:
Stores student exam scores in an ArrayList and categorizes each score as:
- Distinction (90+)
- Pass (40-89)
- Fail (Below 40)

File:
- StudentGradeFilter.java

---

## 3. Invalid Age Protector (Exception Handling)

### Concepts:
- Custom Exception
- Throw
- Try-Catch

### Description:
A voting registration system that checks user age.
If the age is below 18, an `InvalidAgeException` is thrown.

Files:
- InvalidAgeException.java
- VotingRegistration.java

---

## 4. Daily Sales Log (File Handling & Arrays)

### Concepts:
- Arrays
- FileWriter
- BufferedWriter

### Description:
Stores 7 days of sales data in an array and writes the values into:
`weekly_sales.txt`

File:
- DailySalesLog.java

---

## 5. Device Manager (Polymorphism)

### Concepts:
- Abstract Class
- Abstract Methods
- Polymorphism

### Description:
Creates Printer and Scanner objects from an abstract ElectronicDevice class.
The powerOn() method behaves differently for each device.

Files:
- ElectronicDevice.java
- Printer.java
- Scanner.java
- DeviceManager.java

---

## 6. Duplicate Finder (ArrayList & Loops)

### Concepts:
- ArrayList
- Nested Loops

### Description:
Checks a guest list and finds names that appear more than once.

File:
- DuplicateFinder.java

---

## 7. Safe Math Calculator (Exception Handling)

### Concepts:
- Scanner
- Multiple Catch Blocks
- Exception Handling

### Description:
A calculator that performs division and handles:
- Divide by zero error
- Invalid input error

File:
- SafeMathCalculator.java

---

## 8. Product Inventory (Interface & Array)

### Concepts:
- Interface
- Array Processing
- Method Overriding

### Description:
Electronics products implement a Discountable interface.
A 10% discount is applied to all products.

Files:
- Discountable.java
- Electronics.java
- ProductInventory.java

---

## 9. Log File Reader (File Handling & ArrayList)

### Concepts:
- File Reading
- Scanner
- ArrayList
- String Filtering

### Description:
Reads a server log file and stores only lines containing "ERROR".

File:
- LogFileReader.java

---

## 10. ATM Simulation (Encapsulation)

### Concepts:
- Encapsulation
- Private Fields
- Getters and Setters

### Description:
A BankAccount class protects the balance using private access.
Withdrawal logic prevents invalid transactions.

Files:
- BankAccount.java
- ATM.java

---

## 11. Vehicle Fleet (Inheritance & ArrayList)

### Concepts:
- Inheritance
- Method Overriding
- Polymorphism

### Description:
Bike and Bus classes inherit from Vehicle.
Each vehicle calculates rental fees differently.

Files:
- Vehicle.java
- Bike.java
- Bus.java
- VehicleFleet.java

---

## 12. Survey Analyzer (Arrays & Loops)

### Concepts:
- Arrays
- Frequency Array
- Loops

### Description:
Counts the number of times each rating (1-5) appears in survey responses.

File:
- SurveyAnalyzer.java

---

## 13. Library System (Interface)

### Concepts:
- Interface
- Contractual Design
- Method Implementation

### Description:
EBook and PhysicalBook implement a Searchable interface with different search methods.

Files:
- Searchable.java
- EBook.java
- PhysicalBook.java
- LibrarySystem.java

---

## 14. Config Loader (File & Exception Handling)

### Concepts:
- File Handling
- Exception Handling
- File Creation

### Description:
Attempts to read config.txt.
If the file does not exist, creates a default configuration file.

File:
- ConfigLoader.java

---

## 15. Employee Payroll (Mixed Topics)

### Concepts:
- Inheritance
- ArrayList
- File I/O
- Polymorphism

### Description:
Stores employee objects, calculates salary, and exports payroll data into:
`payroll_report.txt`

Files:
- Employee.java
- FullTime.java
- Contractor.java
- EmployeePayroll.java

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework
- Exception Handling
- File Handling
