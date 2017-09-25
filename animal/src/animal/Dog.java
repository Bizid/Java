/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


public class Dog extends Animal {
    
    public Dog(){
        super(15); 
        System.out.println("A Dog has been created");
    }
    public void eat(){
        System.out.println("A Dog is eating");
    }
    public void sleep(){
        System.out.println("A Dog is sleeping");
     }
    //public abstract eat();
    public void ruff(){
        System.out.println("A Dog say ruff");
    }
    public void run(){
        System.out.println("A Dog is running");
    }
}
