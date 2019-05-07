/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rafael.M
 */
public class ColletionListDemo {
   public static void main(String[] args) {
       // List 1
        ArrayList<String> list1 = new ArrayList(); //type specific

        // List 2
        ArrayList list2 = new ArrayList(); //any type of data 

// Add Data in List 
        list1.add("Rafael"); //0
        list1.add("Luis");   //1
        list1.add("Jose");   //2
        list1.add("Manuel"); //3
        list1.add("Omar");   //4

        list2.add("Classroom 200");
        list2.add("Classroom 201");
        list2.add("Classroom 202");
        list2.add("Classroom 203");
        list2.add("Classroom 204");
        list2.add("Classroom 205");

        // 1 Print reference to List 
         System.out.println("========1 Print reference to List =============");
        System.out.println("List One is: " + list1);
        
         System.out.println("================================================");
        
        System.out.println("List Two is: " + list2);

        // 2 Get element from the List 
        System.out.println("========2 Get element from the List  =============");
        String name = list1.get(0);
        System.out.println("Name is:" + name);

        System.out.println("======== Example 2================================");
        Object my = list2.get(5);
        System.out.println("My Classroom is: " + my);

        // 3 Update the element on the List 
        System.out.println("========3 Update the element on the List=============");
        list1.set(2, "Maduro");
        System.out.println("Updated the Name on the List successfully" + list1);

         
        // 4 Remove Element from The List 
        System.out.println("========4 Remove Element from The List===============");
        list1.remove(2);
        System.out.println("Jose was removed from the List: " + list1);
        // list1.clear(); //-> Remove All
        
        // 5 Display the List complete vertical 
        System.out.println("======== 5 Display the List complete vertical ========");
        
        System.out.println("======== Organize List of the Customer ===============");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get((i)));
        }
        System.out.println("======== Complete List of the Stakeholder ============");
        for (String dom : list1) {
            System.out.println(dom);
        }
        System.out.println("======== Example 3=====================================");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get((i)));
        }
        
        System.out.println("======== Iteration =================================");
        Iterator<String> itr = list1.iterator();
//          System.out.println(itr.next());
//          System.out.println(itr.next());
//          System.out.println(itr.next());

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("Rafael")) {
                itr.remove();
            }
        }
        System.out.println("=================After the Iteration================");

        System.out.println("Take a look at this List" + list1);

    }
    
}
