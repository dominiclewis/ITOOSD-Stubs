/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import javax.swing.JOptionPane;
/**
 *
 * @author domin
 */
public class CalculatingFour {
    
    
    public static void main (String[] args){
        
       String firstString, secondString; 
       
       firstString = JOptionPane.showInputDialog("Input the first integer");
       secondString = JOptionPane.showInputDialog("Input the second integer");
       
       int first,second, sum; 
       
       first = Integer.parseInt(firstString);
       second = Integer.parseInt(secondString);
       
       sum = first + second; 
       
       double sumDoub = (double) sum;
       
           JOptionPane.showMessageDialog( null, "My solution is " + (sumDoub /2) );
       
       
       
       
        
    }
    
    
}
