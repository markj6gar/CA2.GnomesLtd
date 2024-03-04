/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.gnomesltd;

import java.util.ArrayList;


// Creating company class to keep company data well managed and
// easy to change if needed
public class Company {

    private String companyName; // field companyName for the name of the company  
    private ArrayList<Employee> staff;
    
    
    //default constructor which initialises all fields in this class
    public Company () {
        this.companyName = "Gnomes Ltd.";
        this.staff = new ArrayList<>();
    }
    
    //overloaded constructor which accepts a name value as a parameter
    public Company (String compnayName) {
        this.companyName = compnayName;
        this.staff = new ArrayList<>();
    }
    
    //addNewStaff() adds a new employee to the staff arrayList (the employee is a parameter). 
    public void addNewStaff(Employee emp) {
        staff.add(emp);
    }
    
    //getStaffNumber() returns the number of employees currently in the arrayList.
    public int getStaffNum() {
        return staff.size();
    }
    
    //
    
}

