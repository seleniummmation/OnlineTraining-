package javabasics;

import org.junit.Test;

public class PrivateModifier {

    /**
     * Private methods (accountBalance & accountBalance2) are only accessible outside this
     * class when they are declared as Public
     */

    private String viewBalance_non_static = "£100 pounds";

    private static String viewBalance_static = "£45 pounds";

    //Non static declaration
    private PrivateModifier accountBalance() {
        System.out.println(viewBalance_non_static);
        return this;
    }

    //Static declaration declaration
    private static void accountBalance2() {
        System.out.println(viewBalance_static);
    }

    //Example of accessing a non static object
    /**
     * Test shows method declared  with private modifier, is accessible within
     * within a class using non static variable (Object)
     */

    @Test
    public void whatIsMyBalance() {
        PrivateModifier priMod = new PrivateModifier();
        priMod.accountBalance();
    }

    //Example of accessing a static object
    /**
     * Test shows method declared with private modifier is also accessible within
     * within a class using static variable (class)
     */

    @Test
    public void whatIsMyBalance2() {
        PrivateModifier.accountBalance2();
    }

    //Example of accessing a non static object declared in DefaultModifier class
    /**
     * Test shows method declared with default modifier, are accessible within a class and sub classes
     * within the same package
     */

    @Test
    public void verifyBalanceOnScreen() {
        DefaultModifier defMod = new DefaultModifier();
        defMod.displayBalance();
    }

}