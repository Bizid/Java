/*
 * Copyright 2017 Lassaad 
 */

package linkedlistgeneric;

/**
 * @author lassaad
 */
public class Node<D> {
    Node<D> next;
    D data;
    
    
    public Node (D newData){
        data = newData;
        next = null;
    }
    
   public Node (D newData, Node newNext){
        data = newData;
        next = newNext;
    } 
   
   public D getData(){
        return data;
   }
   
   public Node<D> getNext(){
       return next;
   }
   
   public void setData(D newData){
       data = newData;
   }
   
   public void setNext(Node<D> newNode){
       next = newNode;
   }
   
}

