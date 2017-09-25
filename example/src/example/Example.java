/*
 * Copyright 2017 Lassaad 
 */
package example;

/**
 *
 * @author lassaad
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String myStr = "good";    
     char[] myCharArr = {'g', 'o', 'o', 'd' };       
           String newStr = null;       
  for(char ch : myCharArr){     
        newStr = newStr + ch;    
     }      
    System.out.println((newStr.equals(myStr))+ " " + (newStr.equals(myStr)));   
    }
    
}
