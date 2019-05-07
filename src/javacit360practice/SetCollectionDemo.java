/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Rafael.M
 */
public class SetCollectionDemo {
    
     public static void main(String[] args) {
         // Here Data is not added as in index
         HashSet<String> set = new HashSet<>(); 
         set.add("Samuel");
         set.add("Jenny");
         set.add("Rafael");
         set.add("Jim");
         set.add("Oscar");
         set.add("Omar");
         set.add("David");
         set.add("Luis");
         
         System.out.println("The Set is: "+set);
         
         Iterator<String> itr = set.iterator();
         while(itr.hasNext()){
             String str = itr.next();
             System.out.println(str);
         }
         
         set.remove("Jim");
         System.out.println("The set after removing Jim is: "+set);
         if (set.contains("Rafael")) {
             System.out.println("Rafael is in the set");             
         }
         
         System.out.println("Set size is: "+set.size());
         
     }
    
}
