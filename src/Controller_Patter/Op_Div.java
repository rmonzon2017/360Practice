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
public class Op_Div implements Operator{
    
    @Override
    public void execute(Float item1, Float item2) {
        Float Div = item1 / item2;
        System.out.println(Div);
    }
    
}
