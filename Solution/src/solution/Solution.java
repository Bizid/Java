/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;
import java.util.*;

/**
 *
 * @author lassaad
 */

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
 class Solution {

    /**
     * @param args the command line arguments
     */
    
   /* Node next;
    int data;
    public Node getNext(){
       return next;
   }
   
   public void setData(int newData){
       data = newData;
   }
   
   public void setNext(Node newNode){
       next = newNode;
   }

public static  Node insert(Node head,int data) {
        Node next;
        Node temp = new Node(data);
        
        while (head.getNext() != null){
            head = head.getNext();
        }
        head.setNext(temp);
    }*/
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
                System.out.println("Grade: " + s.calculate());
       /* Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();*/
        
    }
    
}
