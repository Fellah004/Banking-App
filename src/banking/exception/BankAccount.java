package banking.exception;
public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    static final double DAILY_LIMIT = 50000;

    public BankAccount(int accountNumber,
                       String accountHolder,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero.");
        }

        balance += amount;

        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(double amount)
            throws InvalidAmountException,
            InsufficientBalanceException,
            DailyLimitExceededException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdraw amount must be greater than zero.");
        }

        if (amount > DAILY_LIMIT) {
            throw new DailyLimitExceededException(
                    "Daily Limit Exceeded.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance.");
        }

        balance -= amount;

        System.out.println("Withdraw Successful");
        System.out.println("Current Balance : " + balance);
    }

    public void transfer(BankAccount receiver,
                         double amount)
            throws InvalidAmountException,
            InsufficientBalanceException,
    InvalidAccountException,
            DailyLimitExceededException {

        withdraw(amount);

        receiver.balance += amount;

        System.out.println("Transfer Successful");
    }

    public void display() {

        System.out.println("------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}