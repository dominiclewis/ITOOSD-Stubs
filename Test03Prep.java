/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *To Do:
 * 1. Test & Debug 
 * 2. Build the sameString function once Ben replies on email clearing up about the paramaters
 * @author Dominic
 */
public class Test03Prep {
    
    public static void main (String[] args){
        
        
        
        
    }
    
    public static int biggest(double num1, double num2, double num3){
        int biggestNumber = 0; //this will be the biggest number 
        int returnNumber = 0; 
        
        //Check if num1 is bigger than num 2 
          if (num1 > num2)
          {
              if (num1 > num3){ //num 1 biggest 
             
                  biggestNumber = 1; 
              } else{ //num 3 biggest 
                  biggestNumber = 3;
              }
                     //if num 2 is bigger than num 1 
          } else if (num2 > num1){
              
              if (num2 > num3){ // num 2 biggest
                  biggestNumber = 2; 
              } else {   //num 3 is the biggest
                  biggestNumber = 3;
              }
               
          }
          
          //Set the return number to return the correct value
          switch(biggestNumber){
              
              case 1:
                  returnNumber = (int)num1;

                  break;
                  
              case 2:
                  returnNumber = (int)num2;
                 break;
              
              case 3: 
                  returnNumber = (int)num3; 
                  break; 
                  
              default: 
                  System.out.println("NO BIGGEST NUMBER");
                  break; 
                         
              
          }
          
          
          return returnNumber; //return the int value
    }
    
    public static int adder(int num1, int num2){

        int sum = num1 + num2;
        return sum; 
    }
}
