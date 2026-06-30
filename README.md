# Banking System using Java

A **console-based Banking System** developed in **Java** to demonstrate **Object-Oriented Programming (OOP)** concepts and **Exception Handling** using custom exceptions. The application allows users to manage bank accounts and securely transfer money while validating various banking rules.

---

## Features

* Create and manage bank accounts
* Search accounts using account number
* Deposit money
* Withdraw money
* Transfer money between accounts
* Display account details
* Custom exception handling
* Console-based user interaction

---

## Concepts Covered

* Object-Oriented Programming (OOP)
* Classes and Objects
* Constructors
* Arrays
* Encapsulation
* Method Overloading
* Custom Exceptions
* Exception Handling (`try`, `catch`, `throw`, `throws`)
* Scanner Class
* Java Packages

---

## Project Structure

```text
Banking-System/
│
├── Bank.java
├── BankAccount.java
├── BankApp.java
├── InvalidAmountException.java
├── InvalidAccountException.java
├── InsufficientBalanceException.java
└── DailyLimitExceededException.java
```

---

## Banking Operations

### Deposit

* Deposits money into a bank account.
* Throws an exception if the amount is less than or equal to zero.

### Withdraw

Validates:

* Amount must be greater than zero.
* Amount must not exceed the daily withdrawal limit.
* Sufficient balance must be available.

### Transfer

Transfers money from one account to another after performing all required validations.

### Search Account

Searches for an account using its account number. If the account does not exist, a custom exception is thrown.

---

## Custom Exceptions

The project includes the following user-defined exceptions:

* **InvalidAmountException**

  * Thrown when the entered amount is invalid.

* **InvalidAccountException**

  * Thrown when the account number is not found.

* **InsufficientBalanceException**

  * Thrown when the account balance is insufficient.

* **DailyLimitExceededException**

  * Thrown when the withdrawal exceeds the daily transaction limit.

---

## Technologies Used

* Java
* Eclipse IDE / IntelliJ IDEA
* JDK 8 or above

---

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/Banking-System.git
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Compile all Java files.

4. Run the `BankApp` class.

5. Enter:

   * Sender Account Number
   * Receiver Account Number
   * Amount to Transfer

6. View the updated account details or exception messages.

---

## Sample Output

```text
Enter Sender Account Number:
101

Enter Receiver Account Number:
102

Enter Amount:
10000

Transfer Successful!

Sender Balance : 70000.0
Receiver Balance : 60000.0
```

Example when an exception occurs:

```text
Enter Amount:
-500

InvalidAmountException:
Amount must be greater than zero.
```

---

## Learning Outcomes

Through this project, you will learn:

* Designing Java applications using OOP principles
* Creating and using custom exceptions
* Handling runtime errors effectively
* Implementing banking operations using Java methods
* Improving program reliability through exception handling

---

## Future Enhancements

* User Login and Authentication
* PIN Verification
* Transaction History
* Interest Calculation
* File Handling for Data Persistence
* JDBC Database Integration
* Graphical User Interface (Java Swing/JavaFX)

---

## Author

**Fellah Hakeem**

