/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author lassaad
 */
public class MyBook extends NBook {
    private int price;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    
     public void display(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
     }
    
    
}
