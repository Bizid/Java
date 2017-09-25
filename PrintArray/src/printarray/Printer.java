/*
 * Copyright 2017 Lassaad 
 */

package printarray;

/**
 * @author lassaad
 */

public class Printer<T> {
    
    public <T> void printArray(T[] array){
       
        for (T element : array){
            System.out.print(element);
        }
        System.out.println();
   }

}
