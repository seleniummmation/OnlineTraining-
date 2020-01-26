package javabasics;

import org.junit.Test;

public class ProtectedModifier {

    /**
     * Methods declared with protected modifier are only accessible within a
     * package and sub classes
     *
     * Protected method should be declared as a static method
     */

    protected static void  myAccount() {
        System.out.println("My balance is £599");
    }

    /**
     * Methods declared with public modifier are accessible within
     * a package and outside a package - anywhere
     */
    @Test
    public void weyMyMoney() {
        PublicModifier pubMod = new PublicModifier();
        pubMod.myMoney();
    }
}