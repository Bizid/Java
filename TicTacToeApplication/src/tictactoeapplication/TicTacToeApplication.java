/*
 * Copyright 2017 Lassaad 
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author lassaad
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay){
            System.out.println("Welcome to Tic Tac Toe! You are about to go against the master of Tic Tac Toe !\n But first you must pick what character you want to be ");
            System.out.println();
            System.out.println("Enter a single character that will represent you");
            char playToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playToken,opponentToken );
            AI aie = new AI();
            
            System.out.println();
            System.out.println("Now we can start the game. To play enter a number and your token shall be put in its place\n the number go from 1-9");
            TicTacToe.printIndexBoard();
            System.out.println();
            
            while(game.gameOver().equals("notOver")){
                if(game.currentMarker == game.userMarker){
                    System.out.println("It's your turn Enter a spot for your token");
                    int spot = sc.nextInt();
                    
                    while(!game.playTurn(spot)){
                        System.out.println("Try again. " + spot + " is invalid. This spot is already taken or out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked" + spot + "!");
                }else{
                    System.out.println("It's my turn ");
                    int aiSpot =  aie.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("You picked" + aiSpot + "!");        
                }
                System.out.println();
                game.printBoard();
            }
            
            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("Do you want to play again Y/N");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
             System.out.println();
              System.out.println();
        }
        
        
    }
    
}
