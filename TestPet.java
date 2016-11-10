/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author domin
 */
public class TestPet {
    
    
    public static void  main (String[] args){
        
       Pet testPet = new Pet("Foo", "Goldfish");
       
       Pet pet2 = new Pet ("Harry" , "Dog");
       
       testPet.setName(pet2.getName());   //sets testPet to pet2's name with a getter 
       
        System.out.println(pet2.toString()); //Outputs to string if it's present in the clas file 
    }
    
}
