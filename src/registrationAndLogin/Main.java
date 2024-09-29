/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationAndLogin;

import java.util.Scanner;

/**
 *
 * @author Muthivhi Tshedza
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstname = "", lastname = "", username = "", password = "";
        SignUp signUp = new SignUp();

        // Registration Process
        System.out.println("Register your account:");
        while (true) {
            System.out.print("Enter your firstname: ");
            firstname = sc.nextLine();

            System.out.print("Enter your lastname: ");
            lastname = sc.nextLine();

            System.out.println("Enter username:");
            username = sc.nextLine();

            System.out.println("Enter password:");
            password = sc.nextLine();

            String registrationStatus = signUp.registerUser(username, password);

            System.out.println(registrationStatus);

            if (registrationStatus.equals("Username and password registered successfully"))
            {
                break; 
            }
        }
        

        // Login Process
System.out.println("Login to your account:");
Login login = new Login(username, password);

boolean loginSuccessful = false;
while (!loginSuccessful) {
    System.out.println("Enter username:");
    String enteredUsername = sc.nextLine();

    System.out.println("Enter password:");
    String enteredPassword = sc.nextLine();

    loginSuccessful = login.loginUser(enteredUsername, enteredPassword);

    if (loginSuccessful) 
    {
        System.out.println("Login successful");
        System.out.println("Welcome " + firstname + " " + lastname + ", it is great to see you.");
    } 
    else 
    {
        System.out.println("Username or password incorrect, please try again.");
    }
}
        }
    }

   






    




