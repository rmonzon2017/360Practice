/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit_Demo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;

/**
 *
 * @author Rafael.M
 */
public class Testing_Students {

    public Testing_Students() {
    }

    @Test
    public void Verify_Grade() {
        /*
        /////////////////////////////////////
        TEST CASE # 3
        /////////////////////////////////////
         */
        System.out.println("\tTest number 03");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        double result;
        result = student.CalculationGrade();
        assertEquals((80 + 90) / 2, result, 0.00);

    }

    @Test
    public void testassertTrueandFalse() {
        /*
        /////////////////////////////////////
        TEST CASE # 6
        /////////////////////////////////////
         */
        System.out.println("\tTest number 06");
        Compares compare = new Compares();
        //true
        Assert.assertTrue("It was successfully ", compare.Comparetwostrings("Jose", "Jose"));
        //False 
        Assert.assertFalse("It was fails ", compare.Comparetwostrings("Jose", "Monzon"));
    }

    @Test
    public void Verify_IfNoNull() {
        /*
        /////////////////////////////////////
        TEST CASE # 1
        /////////////////////////////////////
         */
        System.out.println("\tTest number 01");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 1, 1);
        double result;
        result = student.CalculationGrade();
        Assert.assertNotNull("The result is not Null ", result);

    }

    @Test
    public void Verify_IfNull() {
        /*
        /////////////////////////////////////
        TEST CASE # 4
        /////////////////////////////////////
         */
        System.out.println("\tTest number 04");
        Controller_Students students = null;
        Assert.assertNull(students);
    }

    @Test
    public void NoSomeObject() {
        /*
        /////////////////////////////////////
        TEST CASE # 5
        /////////////////////////////////////
         */
        System.out.println("\tTest number 05");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        Controller_Students studenttwo = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        Assert.assertNotSame("This Objects are not the Same", student, studenttwo);
    }

    @Test
    public void SomeObject() {
        /*
        /////////////////////////////////////
        TEST CASE # 7
        /////////////////////////////////////
         */
        System.out.println("\tTest number 07");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        Controller_Students student2 = student;
        Assert.assertSame("This Object are point at the same Object", student2, student);
    }

    @Test
    public void NoEqueals() {
        /*
        /////////////////////////////////////
        TEST CASE # 9
        /////////////////////////////////////
         */
        System.out.println("\tTest number 09");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 10, 80);
        double result;
        result = student.CalculationGrade();
        Assert.assertNotEquals("This result is not iquals", (10 + 80) / 3, result, 0.00);

    }

    @Test
    public void TestArray() {
        /*
        /////////////////////////////////////
        TEST CASE # 8
        /////////////////////////////////////
         */
        System.out.println("\tTest number 08");
        Compares compare = new Compares();
        int expected[] = new int[]{3, 8, 4};
        Assert.assertArrayEquals(expected, compare.Validatearray(new int[]{2, 7, 3}));

    }
    
     @Test
    public void TestThat() {
        /*
        /////////////////////////////////////
        TEST CASE # 2
        /////////////////////////////////////
         */
        System.out.println("\tTest number 02");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        Controller_Students student2 = student;
        Assert.assertThat(student2, is(student));
    }

}
