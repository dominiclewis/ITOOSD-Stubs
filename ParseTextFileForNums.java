/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;
import java.util.Scanner; 
import java.io.*; //import the whole library 
/**
 *
 * @author dominic
 */
public class Practical {
    
     
    public static void main (String[] args){
        //Create local variables
       int numberOfNumbers = 0, numberOfNegativeNumbers = 0, numberOfPositiveNumbers = 0, numberOfZeroes = 0; 
       int tempInt;
  
        //Turn the numbers2 file into an input stream
        InputStream numbers2Stream = Practical.class.getResourceAsStream("numbers2.txt"); //S
                
        //Create new instance of scanner which takes input from numbers2Stream
         Scanner scan = new Scanner(numbers2Stream);
         
         
 
         //Loops for as long as there is a next number
         for(int i = 0; scan.hasNextInt(); i++){
             //This will count how many numbers there are
             numberOfNumbers++;
             
             tempInt = scan.nextInt();  //Use tempInt so it doesn't skip numbers etc
              
 
              //If neg num
             if(tempInt < 0){
                 numberOfNegativeNumbers ++;
             }
             //if pos num
             else if(tempInt > 0){
                 numberOfPositiveNumbers++;
             }
             //if zero
             else{
                 numberOfZeroes++;
             }
          
             
         }//end for
         //Output How many numbers
         System.out.println(numberOfNumbers + " Numbers");
         System.out.println(numberOfNegativeNumbers + " Negative numbers");
         System.out.println(numberOfPositiveNumbers + " Positive Numbers");
         System.out.println(numberOfZeroes + " Zeroes ");
         
         
        
         
        
    }
    
}
