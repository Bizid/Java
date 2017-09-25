/*
 * Copyright 2017 Lassaad 
 */
package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class HangmanApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman I will pick a word and you will try to guess it....");
        System.out.println();
        System.out.println("I have picked my word ....");
        System.out.println();
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay){
            System.out.println("Let's play!");
            Hangman game = new Hangman();
            do{
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();
                
                System.out.println("Enter a character that you think about it ");
                char guess = sc.next().toLowerCase().charAt(0);
                System.out.println();
                while(game.isGuessedAlready(guess)){
                    System.out.println("Try again you already guess that character");
                    guess = sc.next().toLowerCase().charAt(0);
                }
                if(game.playGuess(guess)){
                    System.out.println("Great guess we have it here");
                }else{
                    System.out.println("Unfortunatly we don't have it");
                }
                
            }while(!game.gameOver());
            
            System.out.println();
            System.out.println("Do you want to play another game ? Enter Y if you do.");
            Character response = sc.next().toUpperCase().charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
    }
    
}
