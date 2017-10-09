/*
 * Copyright 2017 Lassaad 
 */
package ransomnote;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class RansomNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        Hashtable<String,Integer> map2 = new Hashtable<String,Integer>();
        
        for (int i = 0; i < magazine.length; i++) {
            map2.put( magazine[i],0);    
            //System.out.println("ExisteInRansom-"+Arrays.asList(ransom).contains(magazine[i]));
        }
        String res = "Yes";
        for (int j = 0; j < ransom.length; j++) {
            if(map2.containsKey(ransom[j]) && map2.get(ransom[j]) == 0){
               // if(map2.get(ransom[j]) == 0){
                    map2.put(magazine[j], 1);
               // }else {
                //    System.out.println("WWW");
                //break;
               // }
            }else{
                res = "No";
            }
        }
        System.out.println(res);
        
         //map2.put( magazine[i],0);    
            //System.out.println("ExisteInRansom-"+Arrays.asList(ransom).contains(magazine[i]));
        
        // magazin:    give me one grand today night
        // ranom:  give one grand today
        
        // magazin:  two times three is not four
        // ransom: two times two is four
        
        
        
    //  give  -> give yes +1
    //  one -> one +1
    //  grand -> grand + 1
    //  today -> today + 1
    //--------/    
    // two -> two +1
    // times -> times +1
    // two -> two +2
    //  is -> is +1
    //  four -> four +1
                
        
        //for(int i = 0; i < ransom.length; i++) {
           // if(Arrays.asList(magazine).contains(ransom[i])){
                //if(map.containsKey(ransom[i])){
                    
             //       map2.put(ransom[i],1);
                //}
           // }
          //  System.out.println("ExisteInRansom-"+Arrays.asList(magazine).contains(ransom[i]));
        //}
        
     /*   int count = 0;
        boolean result = true;
        for(int j = 0; j < n; j++){
            System.out.println(ransom[j]);
            if(map2.get(ransom[j]) == null){
                count++;
                result = false;
               // System.out.println("False");
                //break;
            }
        }
        System.out.println("Fin:" + count + result);
        
       
        //---
        // create map to store
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
        // create list two and store values
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");
        // create list three and store values
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");
        // put values into map
        map.put("A", valSetOne);
        map.put("B", valSetTwo);
        map.put("C", valSetThree);
        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }
         */
    }
    
}
