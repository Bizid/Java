/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author lassaad
 */
public class LinkedList {

    //Properties
    Node head;
    int count;
    
    // Constructors
   /* public LinkedList(){
        head = null;
        count = 0;
    }*/
    
    public LinkedList(Node newHead){
        head = newHead;
        count = 1;
    }
    //Methods
    
    
    //add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public int get(int index){
        if (index <= 0){
            return -1;
        }
        Node current = head;
        for (int i=1;i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    //size
    public int size(){
        return count;
    }
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }        
    //remove
    public void remove(){
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    
    public static void main(String[] args) {
        //LinkedList<String> linkedlist = new linkedList<String>() 
       
            
    }
    
}
