/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_Runnable_demo;
import java.util.*;
/**
 *
 * @author Rafael.M
 */
public class Thread_A extends Threads_Main {
    
    private int ID;
    
    public Thread_A(int ID){
        this.ID = ID;
    }

    //@Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Executors this thread ID =====>> " + ID);
            
        }
    }

   
    
    
    

        
    
    
}
