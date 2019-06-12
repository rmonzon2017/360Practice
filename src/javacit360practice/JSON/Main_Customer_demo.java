/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice.JSON;
import com.google.gson.Gson;
import java.util.*;


/**
 *
 * @author Rafael.M
 */
public class Main_Customer_demo {
    
    public static final void main(String args[]){
        
        Customer custom = new Customer();
        custom.setFirstName("Rafael");
        custom.setLastName("Monzon");
        custom.setAge(35);
        custom.setEmail("snaik520@hotmail.com");
        custom.setPhoneNumber("829-727-8374");      
        
         System.out.println("--Create Object JSON--");
        Gson gson = new Gson();
        String json = gson.toJson(custom);
        
        System.out.println(json);
        
        System.out.println("--Read from  Object JSON--- ");
        
        Customer customone = gson.fromJson(json, Customer.class);
        System.out.println("First Name: "+ customone.getFirstName() + " Last Name: " + customone.getLastName() + " Your age: " + customone.getAge() + " Your Email: "+ customone.getEmail() + " Your Phone Number is: " + customone.getPhoneNumber());
        
        
    }
    
}
