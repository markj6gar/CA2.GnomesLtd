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
            }else{
                System.out.println("Invalid username or password!");
            }
        }
    }
 
}
