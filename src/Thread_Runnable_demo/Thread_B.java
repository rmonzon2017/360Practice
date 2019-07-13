/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_Runnable_demo;

/**
 *
 * @author Rafael.M
 */
public class Thread_B implements Runnable {
     private int ID;     
    
    public Thread_B(int ID){
        this.ID = ID;
    }
    @Override   
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Runnable Thread this thread ID =====>> " + ID);
        }
    }
    
}
