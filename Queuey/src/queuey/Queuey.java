
package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//public class Queuey {
public class Queuey<D> {
   // LinkedList queue = new LinkedList();
    LinkedList<D> queue = new LinkedList();
    public  Queuey(){
        queue = new LinkedList();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    } 
    
    public int size(){
        return queue.size();
    }
    
    //public void enqueue(int n){
   //     queue.addLast(n);
   // }
    
    public void enqueue(D n){
        queue.addLast(n);
    }
    
    //public int dequeue(){
    //    return (int) queue.remove(0);
    //}
    
    public D dequeue(){
        return queue.remove(0);
    }
    
    //public int peek(){
    //    return (int) queue.get(0);
   // }
    
    public D peek(){
        return  queue.get(0);
    }
    
    /*public void enqueueString(String n){
        queue.addLast(n);
    }
    
    public String dequeueString(){
        return (String) queue.remove(0);
    }
    
    public String peekString(){
        return (String) queue.get(0);
    }
    */
    public static void main(String[] args) {
        //FIFO
        
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out" + numberQueue.dequeue());
        System.out.println("Peek at second item" + numberQueue.peek());
        System.out.println("Second out" + numberQueue.dequeue());
        System.out.println("Third out" + numberQueue.dequeue());
        
        //Queuey stringQueue = new Queuey();
       // stringQueue.enqueueString("Hi");
       // stringQueue.enqueueString("There");
       // System.out.print(stringQueue.dequeueString() + " ");
        //System.out.println("Peek at second item" + stringQueue.peek());
       // System.out.print(stringQueue.dequeueString() + " ");
        
        
        Stack<String> stacky = new Stack<>();
        stacky.push("There");
        stacky.push("Hi");
        
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + "! ");
         System.out.println(stacky.size() + "! ");
         
         
     //    Queue<String> queue2 = new Queue<>(); 
        
    }
    
}
