/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

/**
 *
 * @author d29-lewis
 */
public class Person {
    int age; 
    char sex;
    double height;
    String firstName;
    String surname; 
    String hairColour;
    double weight; 
    
    
    //Build the constructure
    
    public Person(int age, char sex, double height, String firstName, String surname, String hairColour , double weight)
    {
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.firstName = firstName;
        this.surname = surname; 
        this.hairColour = hairColour;
        this.weight = weight;
    }
    
    
    //Getter for age
      public int GetAge() { return age;}   
    //Setter for age
      public void SetAge(int age ){ 
          this.age = age;
}
      //getter for sex
      public char GetSex() {return sex;}
      //setter for sex
      public void SetSex(char sex){
          this.sex = sex;     
      }
      //getter for height
      public double GetHeight() { return height;}
      //Setter for hight
      public void SetHeight(double height)
      {
          this.height = height; 
      }
      
      //getter for firstName 
      public String GetFirstName() { return firstName;} 
      
      //Setter for first name
      
      public void SetFirstName(String firstName){
          
          this.firstName = firstName; 
      }
      
      //Getter for surname 
      public String GetSurname() { return surname;} 
      
      //setter for first name
      public void GetSurname(String surname){
          
          this.surname = surname;
          
      }
      //getter for weight
      public double GetWeight() { return weight; }
      
      //Setter for weight
      public void GetWeight (double weight){
          
          this.weight = weight;      
      
}
      
      
      //Override
      @Override
      public String toString(){
          //return the string of theshizzle
          return ("" + firstName + " " + surname + " " + age + " " + height  + " " + weight + "" + hairColour );
      }
      
      
      
}
