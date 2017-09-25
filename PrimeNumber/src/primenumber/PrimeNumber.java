/*
 * Copyright 2017 Lassaad 
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isPrimeNumber(int S){
        boolean isPrime = false;
        int k = Math.round((1 * S) / 2 * 10)/10;
        if(S == 2){
            isPrime = true;
        }else 
        if(S < 2){
            isPrime = false;
        }
        else{
            
            for(int i=2; i <= k; i++){  // 1, n+1  , n
                if(S % i  == 0){ //n*m
                      isPrime = false;
                      break; 
                }
                isPrime = true;
            }
        }
        
        return isPrime;
    }
    
    public static void primeOrNo(int[] c,int n){
        String[] result=new String[n];
        for(int i=0; i < c.length; i++){  
                if(isPrimeNumber(c[i])){ 
                    result[i] = "Prime";
                }else{
                    result[i] = "Not prime";
                }
        }
        printResult(result);
    }
    
    public static void  printResult(String[] c){
        for(int i=0; i < c.length; i++){ 
            System.out.println(c[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = scan.nextInt();
        }
        scan.close();
        long startTime = System.currentTimeMillis();
        primeOrNo(unsorted,n);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test "+ duration + "ms");
//int nr1 =1003;
//int nr2 = 2;
  //      System.out.println(Math.round((1 * nr1) / nr2 * 10)/10);
//System.out.println(isPrimeNumber(7));
        
        
    }
    
}
