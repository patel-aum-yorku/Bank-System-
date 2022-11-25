//Author:- Aum Patel
import org.junit.Test;
import static org.junit.Assert.*;
public class Tester {
    //test to check working of abstract methods
    @Test
    public void test1(){
        bankAccount A1 = new checkingAccount(123,"Aum",3);
        bankAccount A2 = new savingAccount(124,"Raj",4);
        assertEquals("Aum",A1.getAccName());
        assertEquals("Raj",A2.getAccName());
        assertEquals(123,A1.getAccNo());
        assertEquals(124,A2.getAccNo());
    }
    //test to check working of polymorphism
    @Test
    public void test2(){
        bankAccount A1 = new checkingAccount(123,"Aum",3);
        bankAccount A2 = new savingAccount(124,"Raj",4);
        A1.Deposit(1000);
        A2.Deposit(2000);
        assertEquals(997, A1.getAccBalance(),0.1);
        assertEquals(2000,A2.getAccBalance(),0.1);
        A1.Withdraw(300);
        A2.Withdraw(400);
        assertEquals(694, A1.getAccBalance(),0.1);
        assertEquals(1600,A2.getAccBalance(),0.1);
    }
    //test to check working of inheritance.
    @Test
    public void test3(){
        checkingAccount A1 = new checkingAccount(123,"Aum",3);
        savingAccount A2 = new savingAccount(124,"Raj",4);
        A1.Deposit(1000);
        A2.Deposit(2000);
        assertEquals(997, A1.getAccBalance(),0.1);
        assertEquals(2000,A2.getAccBalance(),0.1);
        A1.Withdraw(300);
        A2.Withdraw(400);
        assertEquals(694, A1.getAccBalance(),0.1);
        assertEquals(1600,A2.getAccBalance(),0.1);
    }
    //test to check all getters and setters.
    @Test
    public void test4(){
        bankAccount A1 = new checkingAccount(123,"Aum",3);
        bankAccount A2 = new savingAccount(124,"Raj",4);
        checkingAccount A3 = new checkingAccount(111,"Tara",3);
        savingAccount A4 = new savingAccount(112,"Sarah",4);
        assertEquals("Aum",A1.getAccName());
        assertEquals("Raj",A2.getAccName());
        assertEquals("Tara",A3.getAccName());
        assertEquals("Sarah",A4.getAccName());
        assertEquals(123,A1.getAccNo());
        assertEquals(124,A2.getAccNo());
        assertEquals(111,A3.getAccNo());
        assertEquals(112,A4.getAccNo());
        A1.setAccName("John");
        A2.setAccName("Bella");
        A3.setAccName("Ana");
        A4.setAccName("Rani");
        assertEquals("John",A1.getAccName());
        assertEquals("Bella",A2.getAccName());
        assertEquals("Ana",A3.getAccName());
        assertEquals("Rani",A4.getAccName());
        assertEquals(4,A4.getIntRate(),0.1);
        A4.setIntRate(5);
        A4.Deposit(1000);
        A4.Returns();
        assertEquals(5,A4.getIntRate(),0.1);
        assertEquals(1050,A4.getAccBalance(),0.1);
    }
}
