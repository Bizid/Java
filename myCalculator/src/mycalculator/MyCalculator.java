/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class MyCalculator {
    public class negativeValue extends Exception {
       public String  getMessage(){
           String e = "n and p should be non-negative";
                  
           return e;
       }
    }
    public MyCalculator(){}
    public int power(int n, int p) throws negativeValue{
             int res = (int)Math.pow(n, p);
             
        if(n < 0 || p < 0  ){
            throw new negativeValue();
        }
        
        
        /*try{
            drinkHotChocolat(currentCocoaTemp); 
            System.out.println("That cocoa was good!");
            wrongTemp = false;
            }catch(TooHotException e1){
                 System.out.println("That's Too Hot");
                 currentCocoaTemp = currentCocoaTemp -5;
            }catch(TooColdException e2){
                 System.out.println("That'S soo Cold");
                 currentCocoaTemp = currentCocoaTemp + 5;
            } 
             
             */
             
             return res;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator myCalculator = new MyCalculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
    
}
