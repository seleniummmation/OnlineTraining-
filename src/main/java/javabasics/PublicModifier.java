package javabasics;

import org.junit.Test;

public class PublicModifier {

    /**
     * Public modifier is accessible from a class, subclass within a package and outside a package
     */

    public String withdraw = "$10";

    public PublicModifier myMoney() {
        System.out.println(withdraw);
        return this;
    }

    //Example of public modifier test - anywhere
    @Test
    public void weyMyMoney() {
        PublicModifier pubMod = new PublicModifier();
        pubMod.myMoney();
    }

    //Example of protected modifier test - with package
    @Test
    public void printBalance() {
        ProtectedModifier.myAccount();
    }
}
