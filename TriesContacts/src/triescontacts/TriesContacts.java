/*
 * Copyright 2017 Lassaad 
 */
package triescontacts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lassaad
 */
class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;
 
    public TrieNode() {}
 
    public TrieNode(char c){
        this.c = c;
    }
}
public class TriesContacts {

    /**
     * @param args the command line arguments
     */
    
 
   
        private TrieNode root;

        public TriesContacts() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;
 
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
 
            TrieNode t;
            if(children.containsKey(c)){
                    t = children.get(c);
            }else{
                t = new TrieNode(c);
                children.put(c, t);
            }
 
            children = t.children;
 
            //set leaf node
            if(i==word.length()-1)
                t.isLeaf = true;    
        }
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode t = searchNode(word);
 
        if(t != null && t.isLeaf) 
            return true;
        else
            return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(searchNode(prefix) == null) 
            return false;
        else
            return true;
    }
 
    public TrieNode searchNode(String str){
        Map<Character, TrieNode> children = root.children; 
        TrieNode t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else{
                return null;
            }
        }
        return t;
    }
    
    
    public TrieNode searchFrequency(String str){
        Map<Character, TrieNode> children = root.children; 
        TrieNode t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println("B-"+c);
            if(children.containsKey(c)){
                t = children.get(c);
                System.out.println("t-"+t);
                children = t.children;
                System.out.println("M-"+children);
                System.out.println("TLIEF-"+t.isLeaf);
            }else{
                return null;
            }
            
        }
        // if(t != null && t.isLeaf) 
        //    System.out.println("TLIEF-"+t.isLeaf);
       // else
          //  return false;
 
        return t;
    }
   
    
   
    public static int findPartial(String partialName, String[] inputContact){
        int x =0;
        int i =0;
        while (inputContact[i] != null){
            if(inputContact[i].toLowerCase().contains(partialName.toLowerCase())){
                x++;
            }
            i++;
        }
        return x;
    }
    
    public static void main(String[] args) {
        //slution with array
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] inputContact = new String[n];
        int []result =  new int[n];
        int count = 0;
        int c = 0;
        
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                inputContact[count] = contact;
                count++;
            }else if (op.equals("find")){
                result[c] = findPartial(contact, inputContact);
                c++;
            } 
        }
        for(int i =0; i < c; i++){
            System.out.println(result[i]);
        }*/
        
        //  solution with tries
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        TriesContacts ourDictionarie = new TriesContacts();
        
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                ourDictionarie.insert(contact);
                //inputContact[count] = contact;
                //count++;
                
            }else if (op.equals("find")){
                System.out.println(ourDictionarie.searchFrequency(contact));
               // result[c] = findPartial(contact, inputContact);
               // c++;
            } 
        }
        //for(int i =0; i < c; i++){
        //    System.out.println(result[i]);
       // }
        
    }
    
}
