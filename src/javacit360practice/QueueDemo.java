/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice;

import java.util.PriorityQueue;

/**
 *
 * @author Rafael.M
 */
public class QueueDemo {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < 10; i++) {
            queue.add(i);            
        }
        // Obtaining the head of Queue
        System.out.println("Queue Size is:"+queue.size());
        System.out.println("Head of Queue is: "+queue.peek());
        
        queue.poll(); // removed the head 1
        queue.remove();
        System.out.println("Queue Size After Poll is:"+queue.size());
        System.out.println("Head of Queue is: "+queue.peek());
        
        
        
    }   
    
}
