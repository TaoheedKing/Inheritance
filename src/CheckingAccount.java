/**
 * @author Taoheed King
 *
 */
//CheckingAccout.java 
//Implementation of CheckingAccount class
//that extends BankAccount
public class CheckingAccount extends BankAccount {
   //Declaration of FEE as double type variable
   //set the initial value as 15 cents
   private final static double FEE=0.15;
   //Implementation of Parameterized constructor
   //with parameters name as string type and amount as double type
   public CheckingAccount(String name,double begBal) {
       super(name,begBal);
       //call setAccountNumber function perform an operation
       //accountNumber concatenated with –10
       super.setAccountNumber(getAccountNumber()+"-10");
   }
   //Implementation of withdraw function
   //This method will deduct the Monthly FEE
   public boolean withdraw(double amount)
   {
        boolean boolValue=false;
        //check amount is greater than 100
        if(amount>100 && getBalance()+FEE>=amount)
        {
            super.withdraw(amount+FEE);
            //Display statement
            System.out.printf("After withdrawl of $%.2f, balance = %.2f\n",amount,getBalance());
            boolValue=true;
        }
        //check balance is greater than amount
        else if(getBalance()>=amount)
        {
            //call withdraw function of super class
            super.withdraw(amount+FEE);
            //Display statement
            System.out.printf("After withdrawl of $%.2f, balance = %.2f\n",amount,getBalance());
            boolValue=true;
        }
        else
        {
             //assign boolValue = false
             boolValue=false;  
        }
        return boolValue;
   }
}