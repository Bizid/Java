/*
 * Copyright 2017 Lassaad 
 */
package bstlevelordertraversal;
import java.util.*;
import java.io.*;

/**
 *
 * @author lassaad
 */

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BSTLevelOrderTraversal {

    
    
    
    static void  levelOrder(Node root){
        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        
       if(root != null){
            LinkedList<Node> current = new LinkedList<Node>();
            LinkedList<Node> next = new LinkedList<Node>();
            current.offer(root);
            ArrayList<Integer> numberList = new ArrayList<Integer>();
           
       //     queue.add(root);
        //    queue.
            while(!current.isEmpty())
            {
                Node head = current.poll();
                numberList.add(head.data);
                if(head.left!=null){
                    next.offer(head.left);
                }
                
                if(head.right!=null){
                    next.offer(head.right);
                } 
                
                if(current.isEmpty()){
                    current = next;
                    next = new LinkedList<Node>();
                    result.add(numberList);
                    numberList = new ArrayList<Integer>();
                    
                }
            }
       
       } 
       //System.out.print ( "DD " + result.get(1) + " ");
       for(ArrayList<Integer> i:result){ // iterate -list by list
            for(Integer integer:i){ //iterate element by element in a list
                  System.out.print(integer + " ");  
            }
        }
       
       //for(int i= 0; i <=result.size()-1; i++){
       //  System.out.print ( result.get(i) + " ");
       // }
        
      
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
    
