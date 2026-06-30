public class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    static final double DAILY_LIMIT=50000;
    public BankAccount(int accountNumber, String accountHolder, double balance){
        super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Deposit amount " + "must be greater than Zero!!");
        }
        balance+=amount;
        System.out.println("Deposited successfully!");
        System.out.println("Current balance is "+balance);
    }
    public void withdraw(double amount) throws InvalidAccountException,InvalidAmountException,DailyLimitExceededException,InsufficientBalanceException{
        if(amount<=0){
            throw new InvalidAmountException("withdraw amount must be greater than 0");
        }
        if(amount>DAILY_LIMIT){
            throw new DailyLimitExceededException("Daily Limit Exceeded");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdraw of Rs " +amount+ "Successfully!");
        System.out.println("Current balance is "+balance);
    }
    public void transfer(BankAccount receiver, double amount) throws InvalidAmountException,InsufficientBalanceException,DailyLimitExceededException,InvalidAccountException{
        withdraw(amount);
        receiver.balance+=amount;
        System.out.println("Transfer successfully!");
        System.out.println("Current balance is "+balance);
    }
    public void display(){
        System.out.println("-------------------------------------------");
        System.out.println("Account Number: " + accountNumber+"\n Account Holder: " + accountHolder+"\n Balance "+balance);
    }
}
