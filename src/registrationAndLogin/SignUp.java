/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationAndLogin;

/**
 *
 * @author Tshedza Muthivhi
 */

import java.util.Scanner;

public class SignUp {

    public boolean checkUserName(String username) {
        if (username.length() <= 5 && username.contains("_")) {
            System.out.println("Username successfully captured");
            return true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Password successfully captured");
            return true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            return false;
        }
    }

    public String registerUser(String username, String password) {
        if (checkUserName(username) && checkPasswordComplexity(password)) {
            return "Username and password registered successfully";
        } else {
            return "Registration unsuccessful";
        }
    }
}

