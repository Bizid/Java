/*
 * Copyright 2017 Lassaad 
 */
package anagrams;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static int numberNeeded(String first, String second) {
        String[] firstString = first.split("");
        String[] secondString = second.split("");

        for(int i=0; i < firstString.length; i++){
            for(int j=0; j < secondString.length; j++){
                
                if((firstString[i]).equals(secondString[j])){
                    firstString[i] = "0";
                    secondString[j] = "0";
                }
            }
        }
        int count = 0;
        for(int i=0; i < firstString.length; i++){
            if(!(firstString[i]).equals("0")){
                count++;
            }
            
        }
       for(int j=0; j < secondString.length; j++){
            
            if(!(secondString[j]).equals("0")){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        
          
            
    }
    
}
