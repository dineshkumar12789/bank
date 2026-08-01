import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount account=new BankAccount();
        account.accountNumber=sc.nextInt();
        sc.nextLine();
        account.accountName=sc.nextLine();
        account.balance=sc.nextDouble();

        account.displayDetails();
         sc.close();

    }
   

    
}
