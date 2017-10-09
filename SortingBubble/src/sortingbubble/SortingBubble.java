/*
 * Copyright 2017 Lassaad 
 */
package sortingbubble;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class SortingBubble {

     private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: ");
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] x) {
        printArray("Initial", x);

        int endPosition = x.length - 1;
        int swapPosition;
        int numSwaps =0;
        while( endPosition > 0 ) {
            swapPosition = 0;

            for(int i = 0; i < endPosition; i++) {

                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;

                    swapPosition = i;
                    numSwaps++;
                } // end if

                printArray("Current", x);
            } // end for

            endPosition = swapPosition;
        } // end while

        printArray("Sorted", x);
        System.out.println("Number:" + numSwaps);
        System.out.println("First:" + x[0]);
        System.out.println("Last:" + x[x.length - 1]);
    } // end bubbleSort
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = scan.nextInt();
        }
        scan.close();

        bubbleSort(unsorted);
    }
    
}
