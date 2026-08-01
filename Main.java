import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount account=new BankAccount();
        account.setAccountNumber(sc.nextInt());
        sc.nextLine();
        account.setAccountName(sc.nextLine());
        account.setBalance(sc.nextDouble());

        account.displayDetails();
         sc.close();

    }
   

    
}
