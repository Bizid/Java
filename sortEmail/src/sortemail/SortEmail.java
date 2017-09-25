/*
 * Copyright 2017 Lassaad 
 */
package sortemail;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SortEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> inputList = new ArrayList<String>();
        
         List<String> resultList=new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            inputList.add(scan.next()+" " +scan.next());
        }
        scan.close();
        
        for (int i = 0; i < inputList.size(); i++) {
            String[] s1 = inputList.get(i).split(" ");
            String[] s2 = s1[1].split("@");
            if("gmail.com".equals(s2[1])){
                 resultList.add(s1[0]);
            }
            
	}
        
        
        Collections.sort(resultList);
        for (String key : resultList) 
        {
            System.out.println(key);
        }
        
        
        
      /*  Map<String, String> hmap = new HashMap<String, String>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            hmap.put(scan.next(),scan.next());
        }
        scan.close();
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        ArrayList<String> sortedResult = new ArrayList<String>();
        while(iterator.hasNext()) {
            
           Map.Entry mentry = (Map.Entry)iterator.next();
           String[] s1 = mentry.getValue().toString().split("@");
           
           if("gmail.com".equals(s1[1])){
                System.out.println(mentry.getValue());
               sortedResult.add(mentry.getKey().toString());
               
           }else{
                hmap.remove(mentry.getKey().toString());
           }
        }
   for (String key : sortedResult) 
        {
            System.out.println(key);
        }
        
      
        */
        
    }
    
}
