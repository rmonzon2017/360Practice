/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit_Demo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

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
        TEST CASE # 1
        /////////////////////////////////////
         */
        System.out.println("\tTest number 01");
        Controller_Students student = new Controller_Students("one", "Rafael", "Monzon", 80, 90);
        double result;
        result = student.CalculationGrade();
        assertEquals((80 + 90) / 2, result, 0.00);

    }

    //execute only once, in the starting 
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This execute before class");
    }

    //execute only once, in the end
    @AfterClass
    public static void afterClass() {
        System.out.println("This execute after class");
    }

    //execute for each test, before executing test
    @Before
    public void before() {
        System.out.println("This execute before");
    }

    //execute for each test, after executing test
    @After
    public void after() {
        System.out.println("This executeafter");
    }
    
  


}
