/*
 * Copyright 2017 Lassaad 
 */
package mergesort;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    
    public static long mergesort(int[] array){
        return mergesort(array,new int[array.length], 0, array.length - 1);
    }
    
      //static int count = 0;
    public static long mergesort(int[] array,int [] temp, int leftStart,int rightEnd){
        if(leftStart >= rightEnd){
           // count = 0;
            return 0;
        }
        int middle = (leftStart + rightEnd)/2;
        long count = 0;
        mergesort(array, temp,leftStart, middle);
        count++;
       mergesort(array,temp , middle+1, rightEnd);
        count++;
        mergeHalves(array,temp ,leftStart, rightEnd);
        count++;
        return count;
    }
  
    public static void mergeHalves(int[] array, int[] temp,int leftStart, int rightEnd){
        //long count = 0;
        int leftEnd = (rightEnd + leftStart) /2;
        int rightStart = leftEnd +1;
        int size = rightEnd -leftStart + 1;
        
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        
        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
               // count++;
                left++;
            }else{
                temp[index] = array[right];
                //count++;
                right++;
            }
           // count++;
            index++;
        }
        
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
       // System.out.println("nub "+ count);

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            mergesort(arr);
            for(int i = 0; i < arr.length;i++){
                System.out.print(arr[i]);
            }
            long result = mergesort(arr);
           // System.out.println(result);
        }
        in.close();
    
    }
}
