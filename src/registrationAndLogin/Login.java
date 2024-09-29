/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationAndLogin;
        

/**
 *
 * @author Tshedza Muthivhi
 */

public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }
}










