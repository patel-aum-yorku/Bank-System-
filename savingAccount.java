/**
 * Author:- Aum Patel
 * This class is child class of bankingAccount class
 * an interest rate is applied which is a profit for balance
 *
 */
public class savingAccount extends bankAccount{
    private double intRate;
    public savingAccount() {
        super();
    }

    public savingAccount(int No, String Name,double Rate) {
        super(No, Name);
        intRate = Rate;
    }

    /**
     * access the interest rate
     * @return - interest rate
     */
    public double getIntRate() {
        return intRate;
    }

    /**
     * set interest rate
     * @param intRate -
     */
    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    /**
     * calculate the interest amount and deposit that amount
     *
     */
    public void Returns(){
        Deposit((accBalance*intRate)/100);
        //System.out.println("total balance after returns : $"+accBalance);
    }

    /**
     * This method deposits the amt to balance.
     * amt>0
     * Apply interest rate when implemented in savingAccount class.
     * @param amt-
     */
    public void Deposit(double amt) {
        if(amt>0){
            accBalance += amt;
           // System.out.println("Amount deposited : $"+amt);
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
     * @param amt-
     */
    public void Withdraw(double amt){
        if(amt>0 && (amt <= accBalance)){
            accBalance-=amt;

            //System.out.println("Amount withdrawn : $"+amt);

          //  System.out.println("Total balance after withdraw : $"+accBalance);
        }
       /* else {
            System.out.println("Invalid amount can't be withdrawn!");
        }*/

    }
}
