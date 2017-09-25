/*
 * Copyright 2017 Lassaad 
 */
package arrayleftrotation;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    /**
     * @param args the command line arguments
     */
    
    
    public static int[]merge(int[]a, int[]b){
        int[]c = new int[a.length+b.length];
        int i;
        for(i=0; i<a.length; i++)
           c[i] = a[i];

           for(int j=0; j<b.length; j++)
              c[i++]=b[j];
              return c;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int inputArray[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            inputArray[a_i] = in.nextInt();
        }
        
        //int leftRotationArray[] = new int[n];

        //for(int j=0; j < n; j++){
        //    System.out.print(inputArray[j] + " ");
       // }
        
        int s = (int) Math.ceil((double)k/n) + 1;
       // System.out.println(s);
       int[]c = inputArray;
       for(int l=1; l < s; l++){
            c = merge(c,inputArray);
       }
        
       // int[]c = merge(inputArray,inputArray);
       // for(int i=0; i<c.length; i++)
        //System.out.print(c[i]+" ");
        // System.out.println("----");
        for(int e=k; e < n+k; e++){
            System.out.print(c[e]+" ");
        }
        
        
    }
    
}
