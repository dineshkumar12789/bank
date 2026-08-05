 class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber,String accountName,double balance ){
        super(accountNumber, accountName, balance);
    }

        @Override
        public void displayDetails(){
            super.displayDetails();
            System.out.println("Account type is Savings Account");
            System.out.println("Interest Rate Is  :  4%");

        }


    
    
}
