/*
 * Copyright 2017 Lassaad 
 */
package icecreamparlor;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class IceCreamParlor {

    /**
     * @param args the command line arguments
     */
    

    
    public static  int[] suggestFlavors(int[] a, int m){
        
        int[] res = new int[2];
        boolean exit =false;
        for(int i=0; i < a.length; i++){
            int tmp = m-a[i];
            for(int j= i+1; j <= a.length - 1; j++ ){
                System.out.println(tmp + " "+ a[i] +" " +a[j] );
                if(a[j] == tmp){
                    res[0] = i+1;
                    res[1] = j+1;
                    exit =true;
                    break;
                }   
            }
            if(exit){break;}
        }
        System.out.println(res[0]+ " "+ res[1]);
        return res; 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //nbre of trips
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();  //money
            int n = in.nextInt();  //number of flavors
            int a[] = new int[n];   //array of cost
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
        
            }
            suggestFlavors(a, m);
        }
    }
    
}
