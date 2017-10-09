/*
 * Copyright 2017 Lassaad 
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static int fibonacci(int n) {
        int x = 0;
        if(n == 0){
            x= 0;
        }else if(n == 1){
            x= 1;
        } else {
         for(int i = n; i < 1 ; i--){}
            x += fibonacci(n -1) + fibonacci(n -2); 
        
        } 
        
        // Complete the function.
        return x;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
    
}
