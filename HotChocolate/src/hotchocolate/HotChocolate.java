
package hotchocolate;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HotChocolate {
    public static final double tooHot = 185;
    public static final double tooCold = 160;
    
    public static void drinkHotChocolat(double cocoTemp) throws TooHotException, TooColdException{
        if(cocoTemp >= tooHot){
            throw new TooHotException();
        }else if(cocoTemp <= tooCold){
            throw new TooColdException();
        }
    }
    
    

    
    
    
    
	
	// Print person data
	
    
    
    public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException {
        double currentCocoaTemp = 190;
        boolean wrongTemp = true;
        while (wrongTemp){
            try{
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
            TimeUnit.SECONDS.sleep(2);
        }
        
         System.out.println("It's gone");
         
         
        
         
         
    }
    
}
