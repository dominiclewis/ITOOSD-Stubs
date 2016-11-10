/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Scanner; 
/**
 *To Do:
 * 1. Test & Debug 
 * 2. Build the sameString function once Ben replies on email clearing up about the parameters
 * @author Dominic
 */
public class Test03Prep {
    
    public static void main (String[] args){
        int choice = 0; 
       Scanner scan = new Scanner(System.in);
   
        do{ 
               
        System.out.println("Enter 1 for Biggest");
        System.out.println("Enter 2 for Adder");
        System.out.println("Enter 3 for SameString");
        System.out.println("Enter 4 to quit");
        System.out.println("Enter here: ");
        
        choice = scan.nextInt();
        
         switch(choice){
            
            case 1: 
                double tempNum1,tempNum2, tempNum3;
                System.out.println("Enter num1: ");
                tempNum1 = scan.nextDouble();
                System.out.println("Enter num2: ");
                tempNum2 = scan.nextDouble();
                System.out.println("Enter num3: ");
                tempNum3 = scan.nextDouble();
                int returnedNum = biggest(tempNum1,tempNum2,tempNum3);
                System.out.println("The biggest number is: " + returnedNum);
                break;
                
            case 2 : 
                int num1,num2,returnNum; 
                System.out.println("Enter num1: ");
                num1 = scan.nextInt();
                System.out.println("Enter num2: ");
                num2 = scan.nextInt();
                returnNum = adder(num1, num2);
                System.out.println("The numbers added together equal " +returnNum);
                
                break;
                
            case 3:   
                String str1,str2,str3; 
                boolean value; 
                System.out.println("Enter the first word: ");
                str1 = scan.next();
                System.out.println("Enter the second word: ");
                str2 = scan.next();
                System.out.println("Enter the third word");
                str3 = scan.next();
                
                value = sameString(str1, str2, str3);
                
                if (value == true ){
                    System.out.println("Two of the words match at least");
                } else{
                    System.out.println("None of the words match");
                }
                
                break;
                
            default:
                
                break;
        }
         
        }while(choice != 4) ;
        
        
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
    
    
    public static boolean sameString (String word1, String word2, String word3){
       String word1Upper, word2Upper, word3Upper; 
       Boolean returnValue = false; 
    
       
       word1Upper = word1.toUpperCase();
       word2Upper = word2.toUpperCase();
       word3Upper = word3.toUpperCase();
      
        
     if (word1Upper.equals(word2Upper) == true){ //does word 1  = word 2
         
         returnValue = true; 
     } 
     else if (word1Upper.equals(word3Upper) == true ) //does word 1 = word 3
     {
         returnValue = true; 
     }
     else if (word2Upper.equals(word3Upper) == true) //does word 2 = word 3 
     {
         returnValue = true; 
     }
     
     return returnValue; 
    
       
    }
   
}
