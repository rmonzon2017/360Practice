/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Patter;

import java.util.HashMap;

/**
 *
 * @author Rafael.M
 */
public class Controller {

    private static final HashMap<String, Operator> PublicCalculator2019 = new HashMap<String, Operator>();

    public Controller() {
    }
    // Declare my list of Operation 
    static {

        PublicCalculator2019.put("*", new Op_Mul());
        PublicCalculator2019.put("^", new Op_pow());
        PublicCalculator2019.put("+", new Op_Sum());
        PublicCalculator2019.put("-", new Op_MInor());
        PublicCalculator2019.put("/", new Op_Div());
    }
      /// operation
    public void BringCal(String conexion, Float Item1, Float Item2) {

        Operator manage = PublicCalculator2019.get(conexion);

        manage.execute(Item1, Item2);

    }

   

}
