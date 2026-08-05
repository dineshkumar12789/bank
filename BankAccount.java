class BankAccount{
    private int accountNumber;
    private String accountName;
    private double balance;
    

    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountName() {
        return accountName;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


     public void displayDetails(){
        System.out.println("Detailes are added successfully");
        System.out.print("ACCOUND NUMBER:");
        System.out.println(getAccountNumber());
        System.out.print("ACCOUND NAME:");
        System.out.println(getAccountName());
        System.out.print("BALANCE:");
        System.out.println(getBalance());
    }

}