 class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber,String accountName,double balance ){
        super(accountNumber, accountName, balance);
    }
         @Override
          public void displayDetails()
          {
            super.displayDetails();
            System.out.println("Account type is Current Account");
            System.out.println("Over Draft Facility : Available");

        }
        public void calculateInterest(){
            System.out.println("No interest is calculated for current account");
        }




    }
    

 