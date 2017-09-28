/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;

/**
 *
 * @author d29-lewis
 */
public class Task02 {
    
    
    public static void main (String[] args){
        int emma = 0 ;
        int sofia = 0;
        int olivia = 0;
        String curPers = "";

        Scanner scan = new Scanner(Task02.class.getResourceAsStream("pay.txt"));
        
       
        int count = 0, quant = 0;
        while (scan.hasNext() )
        {
            switch (count)
            {
                case 0 : 
                   
                    curPers = scan.next();
                  
                    count += 1;
                    break;
                case 1: 
                    quant = scan.nextInt();
                 
                    count += 1 ; 
                    break;
                case 2: 
                   
                    switch (curPers)
                    {
                        case "Emma":
                            emma += (scan.nextInt()  * quant);
                       
                            count = 0;
                            break;
                        case "Sofia":
                            sofia += (scan.nextInt()  * quant);
                      
                            count = 0;
                            break;
                        case "Olivia":
                            olivia += (scan.nextInt()  * quant);
                            
                            count = 0;
                            break;
                    }
                            
                        
                    
            }
        }
        
        System.out.println ("Income\nEmma: $" +emma);
        System.out.println ("Sofia: $" +sofia);
        System.out.println ("Olivia: $" +olivia);
    }
}
