//Author:- Aum Patel
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Creating instances using polymorphism
         */
        bankAccount A1 = new checkingAccount(123,"Aum",3);
        bankAccount A2 = new savingAccount(124,"Raj",4);
        System.out.println("Balance of "+A1.getAccName()+"( "+A1.getAccNo()+" ) : $"+A1.getAccBalance());
        System.out.println("Balance of "+A2.getAccName()+"( "+A2.getAccNo()+" ) : $"+A2.getAccBalance());
        System.out.println("---------------------------");
        System.out.println("Balance after deposit-");
        A1.Deposit(1000);
        A2.Deposit(2000);
        System.out.println("---------------------------");
        System.out.println("Balance of "+A1.getAccName()+"( "+A1.getAccNo()+" ) : $"+A1.getAccBalance());
        System.out.println("Balance of "+A2.getAccName()+"( "+A2.getAccNo()+" ) : $"+A2.getAccBalance());
        System.out.println("---------------------------");
        System.out.println("Balance after withdrawing-");
        A1.Withdraw(300);
        A2.Withdraw(400);
        System.out.println("Balance of "+A1.getAccName()+"( "+A1.getAccNo()+" ) : $"+A1.getAccBalance());
        System.out.println("Balance of "+A2.getAccName()+"( "+A2.getAccNo()+" ) : $"+A2.getAccBalance());
    }
}