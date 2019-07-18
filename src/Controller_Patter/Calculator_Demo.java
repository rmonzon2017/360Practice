/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Patter;

import java.util.Scanner;

/**
 *
 * @author Rafael.M
 */
public class Calculator_Demo {
    
    public static void main(String[] args) {
        
        // Variables
        Controller cal = new Controller();
        Float Item1, Item2;
        String conexion;
        Scanner in = new Scanner(System.in);
        
        // Bring the Varible toguether
        System.out.println("Please give a Number: ");
        Item1 = Float.parseFloat(in.nextLine());
       
        System.out.println("Please select your Operation (>> + <<>> - << * >> << / >> ^ <<): ");
        conexion = in.nextLine();
        System.out.println("Please give another Number: ");
        Item2 = Float.parseFloat(in.nextLine());
        
        // calculation 
        System.out.print(Item1 + " " + conexion + " " + Item2 + " = ");        
        cal.BringCal(conexion,Item1, Item2);
        System.out.print("\nThank you for use the Calculation\n");
        
    }
    
}
