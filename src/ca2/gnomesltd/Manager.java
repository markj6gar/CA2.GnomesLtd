/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2.gnomesltd;

/**
 *
 * @author Mark
 */
public class Manager extends Employee {
    
    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this username = username;
    }
    
    public String getPassword() {
        return password;
    }
}
