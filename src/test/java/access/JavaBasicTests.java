package access;

import javabasics.DefaultModifier;
import javabasics.PrivateModifier;
import javabasics.ProtectedModifier;
import javabasics.PublicModifier;
import org.junit.Test;

public class JavaBasicTests extends  ProtectedModifier {

    //Private modifier test outside class
    /**
     * The accountBalance is declared  as a method in PrivateModifier class,
     * any attempt to run it outside of the class will fail as shown below
     *
     * Uncomment priMod.accountBalance(); to run test
     */
    @Test
    public void whatIsMyBalance(){
       PrivateModifier priMod = new PrivateModifier();
       //priMod.accountBalance();
    }

    //Default modifier test outside package test
    /**
     * The displayBalance is declared  as a method in DefaultModifier class,
     * any attempt to run it outside the package (accessmodifier) will fail as shown below
     *
     * Uncomment defMod.displayBalance(); to run test
     */
    @Test
    public void showMyBalance(){
        DefaultModifier defMod = new  DefaultModifier();
        //defMod.displayBalance();
    }

    //Protected modifier test - outside package by subclass
    /**
     * Verifies a method declared with protected modifier
     * can be accessed by sub-classes where IS-A relationship
     * occurs between child and supper class
     */
    @Test
    public void printBalance() {
        ProtectedModifier.myAccount();
    }

    //Public  modifier test - anywhere
    /**
     * Test is accessible from a class, subclass within a package and outside a package
     */
    @Test
    public void weyMyMoney() {
        PublicModifier pubMod = new PublicModifier();
        pubMod.myMoney();

    }
}
