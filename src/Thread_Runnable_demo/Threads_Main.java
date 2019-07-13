/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_Runnable_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Rafael.M
 */
public class Threads_Main {
    static final int Count = 3;  
    public static void main(String[] args) throws InterruptedException{
        
        // Thread number one ///////
        Thread_A thread = new Thread_A(1);
        // Delay for five seg before execute 
        Thread.sleep(5000); 
        System.out.println("The Thread 1 will be started in five seg ");
        thread.run();
        // Delay for five seg before complete the Thread 1
        Thread.sleep(5000);        
        System.out.println("Thread 1 was complete Successfully");
       
        
        // Thread number two that is runnable 
        Thread runnable = new Thread(new Thread_B(2));   
          if (!runnable.isAlive()) {
            System.out.println("Thread one is alive");
        }
        Thread.sleep(5000); 
        System.out.println("The Thread 2 will be started in five seg ");
        runnable.start();        
        // Delay for five seg before complete the Thread 1
        Thread.sleep(5000);
        runnable.join();
        System.out.println("Thread 2 was complete Successfully");
        
        // Thread number thrid that is runnable 
         Thread runnableon = new Thread(new Thread_B(3));
         if (!runnableon.isAlive()) {
             System.out.println("Thread two is alive");
        }
         Thread.sleep(5000); 
        System.out.println("The Thread 3 will be started in five seg = ");
        runnableon.start(); 
        // Delay for five seg before complete the Thread 1
        Thread.sleep(5000);
        runnable.join();
        System.out.println("Thread 3 was complete Successfully");
        
        
        // Create Executors
        
       ExecutorService pool = Executors.newFixedThreadPool(Count);
        
        pool.execute(runnable);
        pool.execute(runnableon);
        
       
        for (int i = 0; i < 6; i++) {
            System.out.println("Executors this thread Main =====>>" + i);
            
        }
        //shutdown
        pool.shutdown(); 
         Thread.sleep(5000);
        runnable.join();
        System.out.println("Thread Main was complete Successfully");
         System.out.println("<<=======The pool has closed for today. "
                 + "Thank you for visiting us. "
                 + "Please come back tomorrow.<<=======");
    }
    
    
     
       
    
}
