/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author acerN
 */
public class Login {
  private String username, password;
    public String nama;

    public Login() {
        nama = "Alfredo Mikha";
        username = "Alfredo";
        password = "Alferdo123";
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

    boolean cekLogin(String inputUsername, String inputPassword) {
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }  
}
