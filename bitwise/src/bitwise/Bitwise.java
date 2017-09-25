/*
 * Copyright 2017 Lassaad 
 */
package bitwise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lassaad
 */


public class Bitwise {

    /**
     * @param args the command line arguments
     */
    
    public  static int findMax(int N, int K ){
        int max = 0;
        List<Integer> resultList=new ArrayList();
        
        for(int i = 1; i < N; i++ ){
            for(int j = i+1; j <= N; j++ ){
              if((i&j) < K){
                  resultList.add(i&j);
              }
            }   
        }
        max = Collections.max(resultList);
       //System.out.println(max);
        
        return max;
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        //new BinaryString("HackerRank", 8675309);
       
       
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        ArrayList<String> inputList = new ArrayList<String>();
        for (int i = 0; i < T; i++) {
            inputList.add(scan.nextInt()+" " +scan.nextInt());
        }
        scan.close();
        
        for (int i = 0; i < inputList.size(); i++) {
            String[] s1 = inputList.get(i).split(" ");
            System.out.println(findMax( Integer.parseInt(s1[0]), Integer.parseInt(s1[1])));
            
	}
        
    }
    
}
