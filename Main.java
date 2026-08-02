import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---Enter the bank details---");
        System.out.println("Enter the Accound Number:");;
        int accountNumber=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Accound name:");
        String accountName=sc.nextLine(); 
        System.out.println("Enter the balance:");
        double balance=sc.nextDouble();
        BankAccount account=new BankAccount(accountNumber,accountName,balance);
         account.displayDetails();
         sc.close();

    }
   

    
}
