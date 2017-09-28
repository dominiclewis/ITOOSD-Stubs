/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task01;

import java.util.Scanner; 

/**
 *
 * @author d29-lewis
 */
public class Task01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(Task01.class.getResourceAsStream("numbers.txt"));
        float evenNumTotal = 0, oddNumTotal = 0, temp = 0;
        int noEve =0, noOdd = 0;
        while ( scan.hasNextFloat() ){
            temp  = scan.nextFloat();
            
            if ( temp % 2 == 0)
            {
                evenNumTotal += temp;
                noEve += 1; 
            } else{
                oddNumTotal += temp;
                noOdd += 1;
            }
            
        }
        float evenAv = evenNumTotal / noEve;
        float oddAv = oddNumTotal / noOdd;
        
       System.out.println("Average of even numbers is " + evenAv);
       System.out.println("Average of odd numbers is " + oddAv);
    }
    
}
