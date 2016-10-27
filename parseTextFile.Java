/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author dominic
 */
public class ParseToken {
    
    public static void main(String[] args){
        int i,x =0, h = 0;
        String input[] = new String[1000];
        
                InputStream tokens2 = ParseToken.class.getResourceAsStream("tokens2.txt"); 
                
                Scanner scan = new Scanner(tokens2);
                
                //Loop that works as long as scanner has next
                for( i = 0; scan.hasNext(); i++){
                    
                    String s = scan.next();
                    
                    //If length is four characters long then output the string
                    if(s.length() == 4){
                        System.out.println(s);
                    }
                    //set input i to equal s 
                   input[i] = s;
                    
                }
                
                //Create a loop that checks if there is a dupe 
             
                    for(x=0; x<=i; x++){
                        for(h =0; h <= i; )
                        if (input[x] == input[h])
                       
                        
                    }
                    
            
                
                //IF YOU WANT to check for an int in a mix of strings , check if there is a string then check if theres and int if not int don't forget to move scanner to next

        
        
    }
    
}
