/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author lassaad
 */
public class Student extends Person{
    private int[] testScores;
    
    //Student s = new Student(firstName, lastName, id, testScores);
    public Student(String first,String last,int id, int[] testScores ){
        super(first,last,id); 
        this.testScores = testScores;
    } 
    public int[] getTestScores(){
        return testScores;
    }
    public String calculate(){
        System.out.println("A Dog is running");
        int sum = 0;
        
        for(int i = 0; i < testScores.length; i++){
		sum +=testScores[i];
	}
            int average = sum / this.getTestScores().length;
            String grade = "";
        if(average < 40){
            grade = "T";
        }else if( 40 <= average &&  average < 55){
            grade = "D";
        }else if( 55 <= average &&  average < 70){
            grade = "P";
        }else if( 70 <= average &&  average < 80){
            grade = "A";
        }else if( 80 <= average &&  average < 90){
            grade = "E";
        }else if( 90 <= average &&  average < 100){
            grade = "O";
        }  
      
      
        return grade;
    }
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}
