/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.gnomesltd;

import java.util.Scanner;

public class ManagerMenu {
    private Company comp;
    private Scanner scn;
    
    public ManagerMenu (Company comp) {
    this.comp = comp;
    this.scn = new Scanner(System.in);
    }
    // creating login using boolean logic and while loop. also setting true vaues with .equuals
    public void LogIn() {
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Enter Username:");
            String username = scn.nextLine();
            System.out.println("Enter Password:");
            String password = scn.nextLine();
            
            if(username.equals("Gnomeo") && password.equals("smurf")){
            loggedIn = true;
                System.out.println("Login Succesful!");
            } else {
                System.out.println("Invalid username or password!");
            }
        }
        showMenu();
    }
   
    
    public void showMenu(){
    
        int choice = 0;
      
        while (choice != 3) {
            System.out.println("\nManager Menu:");   
            System.out.println("1. View current staff");
            System.out.println("2. Add staff");
            System.out.println("3. Exit");
            System.out.println("Make choice: 1 or 2 or 3");
            
            try { 
                choice = Integer.parseInt(scn.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid. Only numbers please.");
                continue;
            }
            
            switch(choice) {
                case 1:
                System.out.println("\\n Current employees");
                comp.listEmployees(0);
                break;
                
                case 2:
                System.out.println("Enter new employee name: ");
                String name = scn.nextLine();
                System.out.println("Enter new employee email: ");
                String email = scn.nextLine();
                
                comp.addNewStaff(new Employee(name, email));
                System.out.println("New employee added");
                break;
                
                case 3:
                System.out.println("Exiting system...");
                break;
                
                default:
                    System.out.println("Wrong choice, try again....");
                }
            }
            scn.close();
            
        
        }
    }

        



