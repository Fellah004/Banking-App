class Bank{
    private BankAccount[] accounts;
    private int count;

    public Bank() {
        this(10);
    }

    public Bank(int size) {
        accounts = new BankAccount[size];
        count = 0;
    }

    public void addAccount(BankAccount account){
        accounts[count++] = account;
    }

    public BankAccount searchAccount(int accountNumber) throws InvalidAccountException {
        for(int i = 0; i < count; i++){
            if(accounts[i].getAccountNumber() == accountNumber)
                return accounts[i];
        }
        throw new InvalidAccountException("Account Not Found");
    }
}