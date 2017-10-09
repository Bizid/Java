/*
 * Copyright 2017 Lassaad 
 */
package test12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author lassaad
 */
class Parent{
    String message = "parent";
    public String getMessage(){
        return message;
    }
}
class Child extends Parent{
    String message = "children";
    @Override
    public String getMessage(){
        return message;
    }
}


class X{
    Y b = new Y();
    X(){
        System.out.print("X");
    }
}

class Y{
    Y(){
        System.out.print("Y");
    }
}

class Z extends X{
    Y y = new Y();
    Z(){
        System.out.print("Z");
    }
}
class Person{
        private final int age;
        Person (int age){
            this.age = age;
        }
        public int hashCode(){
            return age;
        }
    }
public class Test12 {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) throws InterruptedException {
        
        AtomicInteger r = new AtomicInteger(); 
        new Thread(){
            @Override
            public void run(){
                r.incrementAndGet();
            }
            
        }.start();
        System.out.println(r);
        new Z();

        int i = 13;
        int j = 3;
        System.out.println(i / j);
        
        Integer number1 = new Integer(22);
        Integer number2 = new Integer(22);

        Map<Object,Object> map = new HashMap<Object,Object>();
        map.put(number1, number2);
        map.put(number2, number1);
        System.out.println(map.size());
        
        
        Person person1 = new Person(22);
        Person person2 = new Person(22);

        Map<Object,Object> map2 = new HashMap<Object,Object>();
        map2.put(person1, person1);
        map2.put(person2, person2);
        System.out.println(map2.size());
        
        for(int z = 0; z < 5 ; z++){
            switch(z){
                case 0:
                    System.out.print("v ");
                    break;
                case 1:
                    System.out.print("w ");
                    break;
                case 2:
                    System.out.print("x ");
                    break;
                case 3:
                    System.out.print("y ");
                case 4:
                    System.out.print("z ");
                    break;    
                    
            }
        
        }
        
        
        Object m1 = new HashMap(), m2 = new TreeMap();
        System.out.print((m1 instanceof SortedMap)+",");
        System.out.print((m2 instanceof SortedMap)+",");
        System.out.print(m1 instanceof Collection);
        
        
        
        
// TODO code application logic here
       // Parent test = new Child();
       // System.out.print(test.getMessage());
        //for(int i = 0; i < 3; i++){
         //   System.out.print(i);
            
        //}
            
        
    }
    
}
