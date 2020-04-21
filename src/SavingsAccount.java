// SavingsAccount.java
//Implementation of SavingsAccount class that extends BankAccount class
public class SavingsAccount extends BankAccount {
   // Declaring instance variables
   private double rate=2.5;
   //instance variable savingsNumber,initialized to 0.
   private static int savingsNumber=0;
   //Declare instance variable called accountNumber
   //that will hide the accountNumber from the 
   //superclass
   private String accountNumber;
   // Implementation of parameterized constructor
   public SavingsAccount(String name,double begBal)
   {
        //call super class constructor
       super(name,begBal);
       this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
      //increment the savingsNumber
       savingsNumber = savingsNumber + 1;
   }
//Implementation of SavingsAccount constructor with parameters
   public SavingsAccount(SavingsAccount oldAccount,double begBal)
   {
        //call super class constructor
       super(oldAccount,begBal);
       this.rate = oldAccount.getInterestRate();
       this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
       //increment the savingsNumber
       savingsNumber = savingsNumber + 1;
   }
   // getters
   //Implementation of getter function for interest rate
   public double getInterestRate() {
       return rate;
   }
   // Implementation of postInterest function
   //This method will calculate the Interest
   public void postInterest() {
       deposit((getBalance() * (getInterestRate()/1200)));
     
   }
   //Implementation of getAccountNumber function
   public String getAccountNumber()
   {
       return accountNumber;
   }
   // toString method is used to display the contents of an object inside it
   @Override
   //Implementation of toString function
   public String toString() {
        //Display statement
       System.out.printf("AccountNumber %s has been created for %s \nInitial balance = $%.2f",accountNumber,getOwner(),getBalance());
       return "";
   }
}
