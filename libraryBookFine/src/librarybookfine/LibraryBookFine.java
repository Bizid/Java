/*
 * Copyright 2017 Lassaad 
 */
package librarybookfine;

/**
 *
 * @author lassaad
 */
import java.io.*;
import java.util.*;

public class LibraryBookFine {
    public static int convertMonthToDay(int m, int year){
        int numDays=0;
        switch (m) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        
        return numDays;
    }
    
    public static int numberOfDaysForOneMonth(int m1, int y){
        int numDay = 0;
        for(int i=1; i <= m1;i++){
            numDay = numDay + convertMonthToDay(i,y);
        }
        return numDay;
    }
    
    public static int differenceTwoMonthes(int m1, int m2, int y){
        int diff = numberOfDaysForOneMonth(m1, y) - numberOfDaysForOneMonth(m2, y);
        return diff;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        int Da= a[0];
        int Ma= a[1];
        int Ya= a[2];
        
        int De= a[3];
        int Me= a[4];
        int Ye= a[5];
        
        int fine;
        if(Ya < Ye){
            fine = 0;
        } else if(Ya == Ye &&  (Ma < Me)){
            fine = 0;
        }else  if((Ya == Ye) && (Ma == Me) && (De >= Da)){
            fine = 0;
        }else if ((Ya == Ye) && (Ma == Me) && (De < Da)){
            fine = 15 * (Da - De);
        }else if ((Ya == Ye) && (Ma != Me) && (De < Da)){
            fine = 500 * (Ma-Me);
        } else{
            fine = 10000;
        }
        
        System.out.println(fine);


    }
    
}
