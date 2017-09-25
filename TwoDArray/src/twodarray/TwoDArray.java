/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lassaad
 */



public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       int rowSize = 6;
    int colSize = 6;
    int[][] myArray = new int[rowSize][colSize];
    
    int count = 0; 
        
       /* for(int i = 0; i < rowSize; i++) {
           for(int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
            }
        }

        
        for(int i = 0; i < rowSize; i++) {
        // print the row of space-separated values
            for(int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }*/
        
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        
        for(int i = 0; i < rowSize; i++) {
        // print the row of space-separated values
            for(int j = 0; j < colSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
        
        int sum[] = new int[16];
    int h = 0;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                    + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                    + arr[i+2][j+2];
            h++;
        }
    }
    Arrays.sort(sum);
    System.out.println(sum[15]);
       

    }
    
}
