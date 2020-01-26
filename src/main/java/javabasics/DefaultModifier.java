package javabasics;

public class DefaultModifier {

    /**
     * Access modifiers controls which classes can access a field, method of a given class
     *
     * Default modifier fields or methods are only accessible by classes
     * within ths same package.
     *
     * Classes like PrivateModifier, ProtectedModifier, PublicModifier
     * will be able to access the methods as they ALL reside within the
     * same package (javabasics)
     *
     * Outside above mentioned package, Default modifier fields or methods
     * are inaccessible as shown in class(JavaBasicsTest)
     *
     * Uncomment displayBalance() in class (JavaBasicsTest) to run Default modifier test
     */

    String showBalance = "£1000 pounds";

    DefaultModifier displayBalance() {
        System.out.println(showBalance);
        return this;
    }
}
