/*
 * Copyright 2017 Lassaad 
 */

package binarysearchtree;

import java.util.Random;

/**
 * @author lassaad
 */

public class Testers {
    
    // random integers
    public static int rndInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min)+ 1 + min);
        // min = 5, max = 15
        // 15 - 5 = 10 + 1 == 11 --> 0 to 10
        // + 5 to this random number
    }
    
    //random binary search trees
    public static Tree rndTree (int count){
        if(count == 0){
            return new EmptyBST();
        }else{
            return rndTree(count -1).add(rndInt(0,50));
        }
    
    }
    
    
    
    
    public static void checkIsEmpty(Tree t) throws Exception{
        //If the tree t is an instance of EmptyBST --> t,isEmpty --> true    
        //If the tree t is an instance of nonEmptyBST --> t,isEmpty --> false
        if(t instanceof EmptyBST){
            if(!t.isEmpty()){
                throw new Exception("All is not good the tree is an EmptyBST and it is not empty");
            }
        } else if(t instanceof NonEmptyBST){
            if(t.isEmpty()){
                 throw new Exception("All is not good the tree is an NonEmptyBST and it is  empty");
            }
        }

    }
    
    
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        // 1- Either something was added -> and the cardinality increased by one
        if(nT == (t.cardinality())+ 1){
            if(t.member(x)){
                throw new Exception("The cardinality increased by 1 but the thing"
                        + " that was added was already a member of the tree");
            } //else {
                //System.out.println("All is good");
            //}
            // Or the thing that was added was already there and therefore not really added
        //sp the cardinality stayed the same
        }else if(nT == t.cardinality()){
            if(!t.member(x)){
                throw new Exception("The cardinality didn't increased by 1 but we add a new thing");
            } //else {
              //   System.out.println("All is good");
            //}
        } else {
            throw new Exception("Something is wrong with our program");
        }
        
        
    }

}
