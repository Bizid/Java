
package exceptionpractice;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
       
        try{
            
             int result = Integer.parseInt(S);
        
            System.out.println("res = " + result);
        
        }catch(NumberFormatException e ){
            //System.out.println("Exception thrown" + e);
            System.out.println("Bad String");
        }finally{
        System.out.println("Finally clause");
        }
        
        /*
        try{
            int [] c = new int [5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception thrown" + e);
        }finally{
        System.out.println("Finally clause");
        }*/
        //System.out.println("Finally Finished try-catch");
    }
    
}
