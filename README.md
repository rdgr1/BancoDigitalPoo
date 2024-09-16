# Digital Bank Project (Java OOP)

This project is a simulation of a digital banking system built using Object-Oriented Programming (OOP) principles in Java. It features basic banking operations such as deposits, withdrawals, transfers, and more, as well as customer authentication and transaction history tracking.

## Features

- **Banking Operations**:
  - Deposit, withdraw, and transfer funds between accounts.
  - Support for multiple account types, including Current Account and Savings Account.
  
- **Customer Management**:
  - Add or remove customers from the bank.
  - Each customer is linked to a bank account and can perform transactions.
  
- **Transaction History**:
  - Each account stores a history of all transactions performed, including deposits, withdrawals, and transfers.
  - View the transaction history for each account at any time.
  
- **Client Authentication**:
  - Basic password authentication for clients to secure account access.
  
- **Savings Account Interest**:
  - The system includes a functionality to apply interest rates to savings accounts.

## Classes

### 1. `Banco`
Manages a list of customers, allowing them to be added, removed, and viewed. Responsible for managing all customer accounts.

### 2. `Conta`
Abstract base class representing a generic bank account. Contains common account attributes such as account number, agency number, balance, and transaction history. Implements basic banking operations such as `deposit()`, `withdraw()`, and `transfer()`.

### 3. `ContaCorrente` (Current Account)
A concrete class that inherits from `Conta` and represents a checking account.

### 4. `ContaPoupanca` (Savings Account)
A concrete class that inherits from `Conta` and adds functionality for applying interest to the account.

### 5. `Cliente`
Represents a customer of the bank. Stores customer details such as name and password for authentication purposes.

### 6. `IConta`
Interface that defines standard banking operations like `withdraw()`, `deposit()`, and `transfer()`.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/rdgr1/BancoDigitalPoo.git
   cd digital-bank-java
   ```

2. **Compile the project**:
   Use your preferred IDE (such as IntelliJ IDEA or Eclipse) or compile the Java files using the command line:
   ```bash
   javac *.java
   ```

3. **Run the `Main` class**:
   Execute the `Main` class which runs a series of tests simulating banking operations:
   ```bash
   java Main
   ```

## Sample Output

```plaintext
Account 1 (Checking) after operations:
Holder: Alice
Agency: 1 
Account: 1 
Balance: R$500.00 

Account 2 (Savings) after operations:
Holder: Bob
Agency: 1 
Account: 2 
Balance: R$1700.00 

List of Clients in the Bank NOT
Alice
Bob

Transaction History for Account 1:
- Deposit of R$1000.00
- Withdrawal of R$300.00
- Transfer of R$200.00 to Account 2

Transaction History for Account 2:
- Deposit of R$2000.00
- Withdrawal of R$500.00
- Received transfer of R$200.00 from Account 1

Client 1 Authentication:
Authentication successful!

After applying interest to Account 2 (Savings):
Holder: Bob
Agency: 1 
Account: 2 
Balance: R$1734.00
```

## Future Enhancements

- Implementing a user interface (UI) for easier interaction.
- Adding features like loan management and overdraft protection.
- Implementing database integration to store account and transaction data persistently.

## License

This project is open-source and free to use. You may modify and distribute it as per your needs.

