import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---Enter the bank details---");
        System.out.println("Select the Account type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        System.out.println("Enter a choice");
        int choice=sc.nextInt();
        System.out.println("Enter the Accound Number:");;
        int accountNumber=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Accound name:");
        String accountName=sc.nextLine(); 
        System.out.println("Enter the balance:");
        double balance=sc.nextDouble();
        // BankAccount account=new BankAccount(accountNumber,accountName,balance);
        BankAccount account;
        if(choice==1)
        {
            account=new SavingsAccount(accountNumber,accountName,balance);
        }
        else{
            account=new CurrentAccount(accountNumber,accountName,balance);
        }
        BankOperation operation=new BankOperation();
        System.out.print("\nEnter deposit amount:");
        double depositAmount=sc.nextDouble();
        operation.deposite(account,depositAmount);
        operation.checkBalance(account);
        System.out.println("\nEnter withdraw amount:");
        double withdrawAmount=sc.nextDouble();
        operation.withdraw(account,withdrawAmount);
        operation.checkBalance(account);
        
        account.displayDetails();
        account.calculateInterest();

        sc.close();

    }
   

    
}
