package javabasics;

public class OOP {

    //Inheritance
    /**
     * Its a mechanism where an object (usually the child class) derives
     * the properties and behaviour of the parent object
     */

    String parent1 = "dad";
    String parent2 = "mum";

    public OOP father() {
        System.out.println(parent1);
        return this;
    }

    public OOP Mother() {
        System.out.println(parent2);
        return this;
    }

    //Polymorphism
    /**
     * It is when an object can be called in different ways
     *
     * It uses overloading and overriding methods
     *
     * Below methods are an example of overloading methods
     * as OOP class has multiple methods (son()) with the same name
     * different parameter
     */

    String child1 = "boy";
    String child2 = "girl";

    public OOP son() {
        System.out.println(child1);
        return this;
    }

    public OOP son(String child1) {
        System.out.println(child1);
        return this;
    }

}
