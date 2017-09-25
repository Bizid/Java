
package starwarsinterface;

public class Hero implements Character{
     public String weapon = "The Force";
    
    /*public void Enemy(){
        
    }*/
     
     public String getWeapon(){
        return weapon;
    }
    
    public void attack(){
        System.out.println("The hero attacks You!");
    }
    public void heal(){
        System.out.println("The hero heals himself");
    }
}
