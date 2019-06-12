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
public class Demo_tree_set {

    public static void main(String[] args) {

//        Set<String> Tree = new TreeSet<> ();
//       
//        Tree.add("Java Collection");
//        Tree.add("JSON");
//        Tree.add("System Test");
//        Tree.add("Diagram Uses cases");
//        Tree.add("Use Documents");
//
//        for (String element : Tree) {
//            System.out.println(element);
//        }
/////////////////////////////////////////Second Example/////////////

Books First  =new Books(15,"First Book");
Books Second =new Books(1500,"Second Book");
Books Third  =new Books(1000,"Third Book");
Books Fourth =new Books(458,"Fourth Book");
Books Fifth  =new Books(805,"Fifth Book");

      TreeSet<Books> ListBooks = new TreeSet<>();
      ListBooks.add(Fifth);
      ListBooks.add(Fourth);
      ListBooks.add(Third);
      ListBooks.add(Second);
      ListBooks.add(First);
      
      for( Books last: ListBooks){
          System.out.println(last.getDescription());
      }

    }

}
class Books implements Comparable<Books>{
    
    public Books(int num, String Description){
        
        number_pages=num;
        description=Description;
    }
    

    @Override
    public  int compareTo(Books o){
        return number_pages - o.number_pages;
    }
    
    public String getDescription(){
        return description;
    }
    
    private int number_pages;
    
    private String description;
}   
