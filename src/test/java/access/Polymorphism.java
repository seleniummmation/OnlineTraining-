package access;

import javabasics.OOP;
import org.junit.Test;

public class Polymorphism extends OOP {

    /**
     * The test methods (poly1, poly2) clearly resonates
     * with the definition of Polymorphism.
     *
     * Both test shows different ways an object can be called
     */

    @Test
    public void poly1(){
        OOP pol = new OOP();
        pol.son();
    }

    @Test
    public void poly2(){
        OOP pol = new Polymorphism();
        pol.son();
    }

    /**
     * Below test is an example of overriding method
     *
     * The child class (Polymorphism) method (poly3) has
     * overridden child1 field variable ("boy";) declared in
     * the method (son()) of the parent object(OOP)
     *
     * Test displays child class variable (oh boy)
     * when executed and Not "boy" has declared in parent object
     */

    @Test
    public void poly3( ){
        String child1 = "oh boy";
        //System.out.println(child1);
        OOP pol = new Polymorphism();
        pol.son(child1);
    }
}
