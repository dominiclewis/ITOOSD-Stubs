/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import java.util.Scanner; 
/**
 *
 * @author domin
 */
//Class Declaration
public class Pet { //make this private
    public String name;
    public String type;
    
    //Class Constructor
    public Pet(String name, String type){
    //this is for scope
        this.name = name;
        this.type = type;    
}
    
    
    //This is a getter
    public String getName() {return name;}    
   //Setter
    public void setName(String name){
       this.name = name; 
    }
    
    //getter
    public String getType() {return type;}
    //Setter
    public void setType(String type){
        this.type = type;
    }
    //not sure what this does 
    
       @Override        //turns object into string to output DO NOT NORMALLY NEED TO DO THAT BUT CAN DO IF NECESSARY 
    public String toString() {
        return "" + name +  "" + type; 
    
}

}
