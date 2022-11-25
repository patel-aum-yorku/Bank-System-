/**
 * Author:- Aum Patel
 * This class is child of bankAccount class
 * There is transaction charge everytime either deposit or withdraw are called upon
 *
 */
public class checkingAccount extends bankAccount{

    private static double transactionCharge = 2.5;

    public checkingAccount() {
        super();
    }

    public checkingAccount(int No, String Name,double charge) {
        super(No, Name);
        transactionCharge = charge;
    }

    /**
     * This method deposits the amt to balance.
     * amt>0
     * Apply transaction charges when implemented in checkingAccount class.
     * @param - amount
     */
    public void Deposit(double amt) {
        if(amt>0){
            accBalance += amt;
            accBalance -= transactionCharge;
            //System.out.println("Amount deposited : $"+amt);
            //System.out.println("Transaction charges : $"+transactionCharge);
            //System.out.println("Total balance after deposit : $"+accBalance);
        }
       /* else {
            System.out.println("Invalid amt can't be deposited!");
        }*/
    }
    /**
     * This method withdraws money from balance
     * amt>0 && amt<=balance
     *
     * @param - amount
     */
    public void Withdraw(double amt){
        if(amt>0 && ((amt+transactionCharge) <= accBalance)){
            accBalance-=amt;
            accBalance-=transactionCharge;
            //System.out.println("Amount withdrawn : $"+amt);
            //System.out.println("Transaction charges : $"+transactionCharge);
           // System.out.println("Total balance after withdraw : $"+accBalance);
        }
        /*else {
            //System.out.println("Invalid amount can't be withdrawn!");
        }
*/
    }
}
