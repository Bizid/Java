/*
 * Copyright 2017 Lassaad 
 */
package multiplicationarsen;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class MultiplicationArsen {

    /**
     * @param args the command line arguments
     */
    
    public static int  runProgram(Scanner sc, int score){
        int max= 10;
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * max);

        System.out.println(a +" x " + b + "=");
        System.out.println();
        int guess = sc.nextInt();

        if(guess == (a*b)){
            System.out.println("You are right");
            score++;
        } else{
            System.out.println("Sorry it's not correct");
        }
        return score;
    }
    
   
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.out.println("Hi Arsen press enter when you are ready");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication 50 facts in minute test");
        System.out.println();
        System.out.println("Click a key when you are ready");
        System.out.println();
        boolean doYouWantToPlay = true;
        int max= 10;
        boolean timeIsOver = false;
        int timet=  60; // Convert to seconds
        long delay = timet * 1000;
        int score = 0;

        long startTime;
        long endTime;
        long duration;
        while(doYouWantToPlay){
            System.out.println("Let's Start!");
            startTime = System.currentTimeMillis();
            do{
         
                score = runProgram(sc, score);
                
                endTime = System.currentTimeMillis();
                duration = endTime - startTime;
                System.out.println("---- " + score);
                //System.out.println(startTime/1000 -60);
                System.out.println(duration);
                //System.out.println("----");
           }while(duration < 60000);
            
            
            System.out.println();
            System.out.println("Game is over Arsen your score is :" + score);
            System.out.println("Do you want to play another game ? Enter Y if you do.");
            Character response = sc.next().toUpperCase().charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
    }
    
}
