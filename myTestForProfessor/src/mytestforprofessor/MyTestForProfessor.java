/*
 * Copyright 2017 Lassaad 
 */
package mytestforprofessor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lassaad
 */


public class MyTestForProfessor {

    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args)  throws Exception {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();   //numberOfLecture
        
        int tmpN;
        int tmpK;
        
        for (int i = 0; i < t; i++) {
            tmpN = scan.nextInt(); //numberOfStudent
            tmpK = scan.nextInt();  // cancelationThreshold
            int[] caseNumberArray = new int[tmpN+2];
            caseNumberArray[0] = tmpN;
            caseNumberArray[1] = tmpK;

            for (int j = 2; j < caseNumberArray.length; j++) {
              caseNumberArray[j] = scan.nextInt();  
            }
            
            
        }
        scan.close();
        Testers test = new Testers(); 
        test.lessThenFive(t);
        
     //   Testers t = new Testers();
       // t.lessThenFive(a[0]);
        
       
       
    }
    
}
