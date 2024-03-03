
import ca2.gnomesltd.Employee;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mark
 */
public class EmployeeTest {
     public static void main(String[] args) {
         
    //creating the objects 
    Employee emp1 = new Employee ("Joe Bloggs","jb@gmail.com ");
    Employee emp2 = new Employee ("Ann Banana","ab@gmail.com");
    Employee emp3 = new Employee ("Tom Thumb","tt@gmail.com");
         
    // creating the array and filling  it with objects
    Employee[] projectGroup = {emp1, emp2, emp3};
         
         System.out.println("Value of the next employee number is: " + Employee.getNextEmpNum());    
       
         
    // code to search and display the name of each of the employees in the projectGroup array, 
    //who have an employee number above the value stored in a variable called m.     
    
    int m = 1; //1 is a example value 
    
    System.out.println("Employees with employee numberes larger than " + m + " are: ");
    for (Employee emp : projectGroup) {
        if (emp.getEmpNum()> m){
            System.out.println("Employee name: " + emp.getName());    
        }
    }  
  }
}
     
