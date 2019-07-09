/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit_Demo;

/**
 *
 * @author Rafael.M
 */
public class Compares {
       public boolean Comparetwostrings(String Name, String LastName){
        if(Name.equalsIgnoreCase(LastName)){
            return true;
        }
        else{
            return false;
        }
       
   }
      

       
       public int [] Validatearray(int [] Objects){
           int length = Objects.length;
           int result [] = new int[length];
           for (int i = 0; i < length; i++) {
               result[i] = Objects[i]+1;
           }
           return result;
       }
       

        
   } 
    

    

