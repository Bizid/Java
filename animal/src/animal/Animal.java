/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author lassaad
 */
public abstract class Animal {
    //public int age;
    private int age;
    public Animal(int age){
         this.age = age;
         System.out.println("An animal has been created");
     }
     public abstract void eat();
     
     public void sleep(){
        System.out.println("An animal is sleeping");
     }
     public int getAge(){
     return age;
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();
        
        //Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        Object str = "est";
        String realstr = (String) str;
        str.getClass();
        
        
        Dog doggy = new Dog();
        if (doggy instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();

// TODO code application logic here
       // Animal animal = new Animal();
        //animal.
    }
    
}
