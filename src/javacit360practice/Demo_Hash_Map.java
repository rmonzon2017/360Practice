/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice;

import java.util.*;

/**
 *
 * @author Rafael.M
 */
public class Demo_Hash_Map {

    public static void main(String[] args) {

        HashMap<String, String> CustomerList = new HashMap<>();
        //add customer List 
        CustomerList.put("Miguel", "809458963");
        CustomerList.put("Jose", "809458970");
        CustomerList.put("Omar", "809458975");
        CustomerList.put("Jennifer", "809458980");
        CustomerList.put("Laura", "809458995");
        CustomerList.put("Stephany", "809458999");

        //size our list 
        int num = CustomerList.size();
        System.out.println("Our Size of the List is: " + num);

        // get List
        String PhoneNumber = CustomerList.get("Omar");
        System.out.println("Your Phone Number is : " + PhoneNumber);

        // remove someone from the list 
        CustomerList.remove("Laura");
        int x = CustomerList.size();
        System.out.println("Our size is : " + x);

        // Verify elements 
        boolean jump = CustomerList.isEmpty();
        System.out.println("Do you have elements here? : " + jump);

        // Clean 
        CustomerList.clear();
        int j = CustomerList.size();
        System.out.println("Our Size is: " + j);

    }

}
