public class BankOperation {
    public void deposite(BankAccount account,double amount){
        if(amount>0){
            account.setBalance(account.getBalance()+amount);
            System.out.println("Amount deposited sucessfully");
        }
        else{
            System.out.println("Invalid amount");
        }    
        
    }
    public void withdraw(BankAccount account,double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }
        else{
            account.setBalance(account.getBalance()-amount);
            System.out.println("Amount withdraw successfully");
        }
        
    }
    public void checkBalance(BankAccount bank){
        System.out.println("Current balance is:" + bank.getBalance());

    }

    
}
