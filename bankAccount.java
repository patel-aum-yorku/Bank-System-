/**
 * Author:- Aum Patel
 * This is an abstract class, which also act as parent class (super class).
 *
 */
public abstract class bankAccount {
    private int accNo;
    private String accName;
    protected double accBalance;

    /**
     * This constructor creates account with number and name and by default balance is 0
     * @param No - account number
     * @param Name - account holder's name
     */
    public bankAccount(int No, String Name) {
        this.accNo = No;
        this.accName = Name;
        this.accBalance = 0;
    }
public bankAccount(){}
    //Implementing normal methods
    /*
    Don't need to implement setter methods for account balance and number because firstly account balance can be changed only
    via deposit or withdraw methods and secondly numbers  are unique and are given once.
     */
    /**
     * access the  account number
     * @return - account number
     */
    public int getAccNo() {
        return accNo;
    }

    /**
     * access account holder's name
     * @return - account name
     */
    public String getAccName() {
        return accName;
    }

    /**
     * Set the name of account holder
     * @param Name -
     */
    public void setAccName(String Name) {
        this.accName = Name;
    }

    /**
     *  access the  account balance
     * @return - account balance
     */
    public double getAccBalance() {
        return accBalance;
    }

    //Abstract methods

    /**
     * This method deposits the amount to balance.
     * amount>0
     * Apply transaction charges when implemented in checkingAccount class.
     * @param amount -
     */
    public abstract void Deposit(double amount) ;

    /**
     * This method withdraws money from balance
     * amount>0 && amount<=balance
     *
     * @param amount -
     */
    public abstract void Withdraw(double amount);
}
