class BankAccount{
    private int accountNumber;
    private String accountName;
    private double balance;
    

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


    void displayDetails(){
        System.out.println("-----ACCOUND NUMBER-----");
        System.out.println(getAccountNumber());
        System.out.println("-----ACCOUND NAME-----");
        System.out.println(getAccountNumber());
        System.out.println("-----BALANCE-----");
        System.out.println(getBalance());
    }

}