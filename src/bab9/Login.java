/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

/**
 *
 * @author acerN
 */
public class Login {
 private String username, password;
    public String nama;

    public Login() {
        nama = "alfredo mikha ";
        username = "alfredo";
        password = "123";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean cekLogin(String enteredUsername, String enteredPassword) {
        // Use equalsIgnoreCase for case-insensitive comparison
        return username.equalsIgnoreCase(enteredUsername) && password.equals(enteredPassword);
    }    
}
