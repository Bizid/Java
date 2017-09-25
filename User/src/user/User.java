/*
 * Copyright 2017 Lassaad 
 */
package user;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lassaad
 */
public class User {

    /**
     * @param args the command line arguments
     */
    
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String customUsername,  String customPassword,  int customAge, Set<Integer> orderIDs){
        this.username = customUsername;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set a = new HashSet();
        a.add(1212);
        User kathryn = new User("blond","helloworld",10,a);
    }
    
}
