abstract class BankAccount implements BankOperation{
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
    @Override
     public void deposite(double amount){

        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited sucessfully");
        }
        else{
            System.out.println("Invalid amount");
        }    
        
    }
    @Override
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }
        else{
           balance-=amount;
            System.out.println("Amount withdraw successfully");
        }
        
    }@Override
    public void checkBalance(){
        System.out.println("Current balance is"+":"+ balance);
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
    public abstract void calculateInterest();

}