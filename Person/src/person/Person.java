
package person;

import static person.HairColor.*;


public class Person {

    HairColor hairColor = BLACK;
    
    public  Person(){
    } 
    public static void main(String[] args) {
       
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = PINK;
        spiderMan.hairColor = RED;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spiderman: " + spiderMan.hairColor);
    }
}
