/*
 * Copyright 2017 Lassaad 
 */
package runtime;

import java.util.HashMap;

/**
 *
 * @author lassaad
 */
public class RunTime {
    public static int findNumsOfRepetitions(String s, char c){
        //Linear time ; O(n) time
        int sum = 0;  //1
        for(int i=0; i < s.length();i++){   //1, n+1 , n
            if(s.charAt(i)==c){  //n
                sum++;  //n
            }
        }
        return sum;  //1
    }
    
    public static int[] findNumsOfRepetitions1(String S, char[] c){
        //Quad time: O(n *m) time
        int[] sums = new int[c.length];  //1
        for(int i=0; i < S.length(); i++){  // 1, n+1  , n
            for(int j=0; j < c.length; j++){  //n+1, n*m + 1 , n*m
               if(S.charAt(i)==c[j]){ //n*m
                sums[j]= sums[j]+1;  //n*m
               }
            }
        }
        return sums;
    }
    
    
    public static int[] findNumsOfRepetitions2(String S, char[] c){
        //Quad time: O(n+m) time
        int[] sums = new int[c.length];  //1
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i < S.length(); i++){  // 1, n+1  , n
               if(!map.containsKey(S.charAt(i))){ 
                map.put(S.charAt(i), 1);  
               }else{
                   int sum = map.get(S.charAt(i));
                   map.put(S.charAt(i), sum+1);
               }
           
        }
        for(int j=0; j < c.length; j++){
            int sum;
            if(!map.containsKey(c[j])){ 
                sums[j]=0;  
            }else{
                sums[j]= map.get(c[j]);
            }
        }
        return sums;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abca",'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test "+ duration + "ms");
        
        char[] a = {'a','b'};
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions1("abcadssdsdsdsdssfsdgsfadsvagergaegsfadggadvvdvzsdvsdsdfgvsdgddv dfkjghskdjb dfbvdbdfvdb,zv.vbzm.,vmzbvmzbfv",a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test "+ duration + "ms");
        
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions2("abcadssdsdsdsdssfsdgsfadsvagergaegsfadggadvvdvzsdvsdsdfgvsdgddv dfkjghskdjb dfbvdbdfvdb,zv.vbzm.,vmzbvmzbfv",a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test "+ duration + "ms");
    }
    
}
