/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.io.*;
import java.util.*;

/**
 *
 * @author lassaad
 */
public class Palindrome {
    public class Queuey {
        LinkedList queue = new LinkedList();
        public  Queuey(){
            queue = new LinkedList();
        }

        public void enqueueChar(char n){
            queue.addLast(n);
        }

        public char dequeueChar(){
            return (char) queue.remove(0);
        }

        public String peekString(){
            return (String) queue.get(0);
        }
        }
       // Queue<String> queue = new Queue<>();
        Queuey numberQueue = new Queuey();
        Stack<Character> stacky = new Stack<>();
        
        public  void pushCharacter(char ch){
              stacky.push((char) ch);
        }

        public void enqueueCharacter(char ch){
              numberQueue.enqueueChar(ch);
        }

        public char popCharacter() {
            return (char) stacky.pop();
        }
        
        public char dequeueCharacter() {
            return (char) numberQueue.dequeueChar();
        }
        
                       

        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            scan.close();

            // Convert input String to an array of characters:
            char[] s = input.toCharArray();

            // Create a Solution object:
            Palindrome p = new Palindrome();
            
            

            // Enqueue/Push all chars to their respective data structures:
            for (char c : s) {
                p.pushCharacter(c);
                p.enqueueCharacter(c);
            }

            // Pop/Dequeue the chars at the head of both data structures and compare them:
            boolean isPalindrome = true;
            for (int i = 0; i < s.length/2; i++) {
                if (p.popCharacter() != p.dequeueCharacter()) {
                    isPalindrome = false;                
                    break;
                }
            }

            //Finally, print whether string s is palindrome or not.
            System.out.println( "The word, " + input + ", is " 
                               + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        }
}

