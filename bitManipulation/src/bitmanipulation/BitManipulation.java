/*
 * Copyright 2017 Lassaad 
 */
package bitmanipulation;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Map.Entry;
import java.util.regex.*;

public class BitManipulation {

    /**
     * @param args the command line arguments
     */
   // private static final String[] EMPTY_STRING_ARRAY = new String[0];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
        }
       // int res[] = new int[n];
       
        
      
        
      /* for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                System.out.println(a[i] +" - " + a[j]);
                if((a[i]==a[j])){
                   // a[i] = -1;
                    //a[j] = -1;
                }else{
                    //if(a[i] != -1 && a[j] != -1){
                        res[i] = a[i];
                        System.out.println(a[i]);
                    //}
                    
                }
            }   
        }
       
       */
      
       // System.out.println( Arrays.toString(arr));
       Arrays.sort(arr);
       // System.out.println( Arrays.toString(arr));
        
       int f = 0;
       int count = 0;
       for(int i=0; i < arr.length-1; i=i+2){
           
        if(arr[i]!=arr[i+1]){
            System.out.println(arr[i] +" - "+ arr[i+1]);
            f = arr[i];
            count ++;
            //System.out.println("EE"+arr[i]);
            break;
        }   
       }
       if (count == 0){
        f = arr[arr.length -1];
       }
       System.out.println( f);
       
       
     /*  Collection<String> listOne = new ArrayList(Arrays.asList("a","b", "c", "d", "e", "f", "g"));
    Collection<String> listTwo = new ArrayList(Arrays.asList("a","b",  "d", "e", "f", "gg", "h"));


    List<String> sourceList = new ArrayList<String>(listOne);
    List<String> destinationList = new ArrayList<String>(listTwo);


    sourceList.removeAll( listTwo );
    destinationList.removeAll( listOne );



    System.out.println( sourceList );
    System.out.println( destinationList );
        */
       // System.out.println( Arrays.toString(arr));
       // Arrays.sort(arr);
       // System.out.println( Arrays.toString(arr));
        
       // System.out.println("-------");
      //  for(int k=0; k < n; k++){
      //      System.out.println(res[k]);
      //  }
        
        
   
  
 
        
    
    }
    
}
