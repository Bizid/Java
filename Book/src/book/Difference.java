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
class Difference {
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] elements) {
        
        this.maximumDifference = maximumDifference;
        this.elements = elements;
       
                
                
        
    }
    
    
     public void computeDifference(){
         int tmpMax = 0;
        for(int b = 0; b < elements.length - 1; b++){ 
            for(int k = b+1; k < elements.length; k++){ 
                
             tmpMax = Math.abs (elements[b] - elements[k]);
             if (maximumDifference < tmpMax) {
                  maximumDifference = tmpMax;
             }  
            }  
        }
     
     }
    
   
    
        
    
}
