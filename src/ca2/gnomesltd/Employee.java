/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2.gnomesltd;

/**
 *
 * @author Mark
 */
public class Employee {

    //
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1; //nextEmpNum, of type int and initialized to 1, 
    
    //constructuor with defult values 
   public Employee() {
       this.name = "";
       this.email = "";
       this.empNum = nextEmpNum; // which initialises empNum in the constructor. 
       nextEmpNum++; // incremented to give consecutive numbers to each newly created object
   }
   
   // constructor with parameters
    public Employee(String name, String email) {
       this.name = name;
       this.email = email;
       this.empNum = nextEmpNum;
       nextEmpNum++;
    }
    //Accessor methods to return name, email and empNum values.
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getEmpNum() {
        return empNum;
    }
    
    public void setEmail(String email) {
      if (email.length() > 3) { 
          this.email = email;
          
        } else {
          System.out.println("Email must be more than 3 characthers.");
        }
    }
    //getNextEmpNum() - to return the current value of nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
    

