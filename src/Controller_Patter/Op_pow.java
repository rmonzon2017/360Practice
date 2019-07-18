/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Patter;

/**
 *
 * @author Rafael.M
 */
public class Op_pow implements  Operator{
    
    @Override
    public void execute(Float Item1, Float Item2) {
        double power = Math.pow(Item1, Item2);
        System.out.println(power);
    }
    
}
