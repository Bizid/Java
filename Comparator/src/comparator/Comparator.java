/*
 * Copyright 2017 Lassaad 
 */
package comparator;

/**
 *
 * @author lassaad
 */
import static java.lang.Boolean.compare;
import java.util.*;
 class  Checker extends Comparator {
    // Comparator<? super T> c
     //Checker() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public Checker(Player o1, Player o2) {
        super(o1, o2);
    }

    //public void Comparator(){
    
    //}
    
}

class Comparator {
    Comparator(Player o1, Player o2){
        if(o1.score < o2.score){
            switchPlayer(o1,o2);
        }else if(o1.score == o2.score){
            comparePlayerByName(o1,o2);
        }
    }

    private void switchPlayer(Player o1, Player o2) {
        Player tmpPlayer = o1;    
        o1 = o2;
        o2 = tmpPlayer;
    }

    private void comparePlayerByName(Player o1, Player o2) {
        if(o1.name.toLowerCase().charAt(0) < o2.name.toLowerCase().charAt(0)){
            switchPlayer(o1,o2);
        }
    }
    
}

class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
public class Comparator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
         //sort(T[] a, Comparator<? super T> c)
        Arrays.sort(player, checker);
        
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
    
}
