package general; 
import java.util.Scanner;  //For Scanner
import java.io.*; //For input stream
/*
Author: Dominic Lewis
Date Created: 20161102
Path is in project properties(Right Click) Look at netbeans project structure and relate it to folders there

*/
public class ICT02Example{

public static void main(String[] args){
   char userEntry = 'x';
//Create new scanner instance 
Scanner mainScan = new Scanner(System.in);
    do{
    System.out.printf("\n1:Parse int \n2:Parse double\n3:Parse strings\n4:Parse lines of Strings\n5.Parse match\nQ:Quit\n");
        System.out.println("Enter here: ");    
    userEntry = mainScan.next().charAt(0); //accepts the firstChar
        
           switch(userEntry){
               //parseint 
               case '1':
                   parseTextInt(); 
                   System.out.printf("\n\n\n\n");
                   break;
                 //parseDouble
               case '2':
                   parseTextDouble();
                   System.out.printf("\n\n\n\n"); 
                   break;
                  //parse String 
               case '3':
                   parseTextString();
                   System.out.printf("\n\n\n\n"); 
                   break;
                   
                   //parse line of string
               case '4':    
                  parseTextStringLine();
                  System.out.printf("\n\n\n\n"); 
                   break;
                   //parse match
               case '5':
                   parseTextMatchString();
                     System.out.printf("\n\n\n\n"); 
                   break;
                   //quit 
               case 'q': 
               case 'Q':
                   
                   break; 
                   
           }//end switch
    
    }while (userEntry != 'Q' && userEntry != 'q');
//end do while





}//end main

//Parses a text file for ints 
public static void parseTextInt(){
    //Creat inputstream 
    
    int numOfNums = 0,numPositive = 0, numNeg = 0, numZero = 0;
    int tempInt; 
    
    //Create InputStream for ints
    
    InputStream intInputStream = ICT02Example.class.getResourceAsStream("numbersA.txt");
   
    //Create scanner instance that reads from the stream
    Scanner scan = new Scanner(intInputStream);
    //Loop that continues until there are no more ints;
    while(scan.hasNextInt()){
        //Set temp into the be the next int ensuring that no ints ae skipped or stalled on
        tempInt = scan.nextInt();
        numOfNums++;
        //Check if temp int is poisitve
        if(tempInt > 0 ){
            numPositive++;
        } //end if
        else if (tempInt < 0) { //Check if int is negative
            numNeg++;
            
        } //end else if 
        else{ //if neither of above branches then number is 0
           numZero++;
        } //end else
        
    }//end while
    
    System.out.printf("\nThere are %d numbers in total\nThere are %d positive numbers\nThere are %d negative numbers\nThere are %d zeroes present in the file\n", numOfNums, numPositive, numNeg, numZero);
       
}//end method(parseTextInt)

//Parse text file for double
public static void parseTextDouble(){
       
    int numOfNums = 0,numPositive = 0, numNeg = 0, numZero = 0;
    double tempDoub; 
    double match = 80.18; 
   
    //Create import stream instance
    InputStream doubInputStream = ICT02Example.class.getResourceAsStream("numbersB.txt");
   
        //Create scanner instance from input stream
        Scanner scan = new Scanner(doubInputStream);
        //This does the same as the whole
       for(; scan.hasNextDouble();){
                 numOfNums++; 
           tempDoub = scan.nextDouble();
     
           //check for match
           if(tempDoub == match ){ //Match found 
               System.out.println("Match Found!!!");
           }//end if
           
            if(tempDoub > 0){ //positive num
               numPositive++; 
           }//end if
           else if (tempDoub < 0 ){ // negative num
           numNeg++; 
       }//end elseif 
           else{ //number is zero 
               numZero++; 
           } //end else 
           
           
       }//end for 
     System.out.printf("\nThere are %d numbers in total\nThere are %d positive numbers\nThere are %d negative numbers\nThere are %d zeroes present in the file\n", numOfNums, numPositive, numNeg, numZero);
} //end method (parseTextDouble 
//Parses indiviual strings
public static void parseTextString(){
String tempString;
int numOfString = 0; 
    
//Create inputStream instance
    InputStream stringInputStream = ICT02Example.class.getResourceAsStream("inputD.txt");
    
    //Create Scanner instance
    Scanner scan = new Scanner(stringInputStream);
    //has next checks for next string
    while(scan.hasNext() ){
        numOfString++;
        tempString = scan.next();
        if (tempString.length() > 10){
            System.out.println(tempString);
        }//end if 
        
    }//end while
        
   
    System.out.println("\nThere are " +numOfString + " words"); 
    
}//end method 

public static void parseTextStringLine(){
String tempString;
int numOfStringLines = 0; 
    
//Create inputStream instance
    InputStream stringInputStream = ICT02Example.class.getResourceAsStream("inputC.txt");
    
    //Create Scanner instance
    Scanner scan = new Scanner(stringInputStream);
    //has next checks for next string
    while(scan.hasNextLine() ){
        numOfStringLines++;
        tempString = scan.nextLine();
        if (tempString.length() > 40){
            System.out.println(tempString);
        }//end if 
        
    }//end while
        
   
    System.out.println("\nThere are " +numOfStringLines + " lines"); 
    
}//end method 
//Finds a matching string
public static void parseTextMatchString(){
    boolean match = false; 
    String temp, matchParam = "JVM";
    int numStrings = 0;  
    //Create instance of input stream
    InputStream stringInputStream = ICT02Example.class.getResourceAsStream("inputD.txt");
    //Create instanc of scanner
    Scanner scan = new Scanner(stringInputStream);
    
    while(scan.hasNext()){
     numStrings++; 
 
     temp = scan.next();
     // Checks if Match param is the literall same as temp 
     //Returns true if true, false if incorrect 
      match = matchParam.equals(temp);
      
      if(match == true ){
          System.out.println("Match found");
      }//end if 
      else if (match == false){
          System.out.println("No match found(THIS SHOULD NEVER HAPPEN)");
      }//end else if
    
    //Evaluate equals statement
    
 
     
    }//end while 
           System.out.println("Evaluated " + numStrings +" strings");
    
}//end method 


}//end class