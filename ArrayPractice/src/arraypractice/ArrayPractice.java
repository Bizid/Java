/*
 * Copyright 2017 Lassaad 
 */
package arraypractice;

import java.util.Arrays;

/**
 *
 * @author lassaad
 */
public class ArrayPractice {

    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.print(element);
        }
        System.out.println();
        
       
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 9, 1, 3};
        
        String[] shoppingList = {"bananas","apples", "pears"};
        
        intArray2[0]= 10;
        intArray2[1]= 8;
        intArray2[2]= 5;
        intArray2[3]= 10;
        
         System.out.print(Arrays.toString(intArray2));
         System.out.print(Arrays.toString(intArray3));
         System.out.println();
         
         printArray(intArray2);
         printArray(intArray3);
         System.out.println();
         
         Arrays.sort(intArray3);
         printArray(intArray3);
         
         printArray(shoppingList);
         
         System.out.println("Special For Loop:");
         for (String s: shoppingList){
             System.out.println(s);
         }
         
        
    }
    
}
