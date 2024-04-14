/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poe1;

import javax.swing.JOptionPane;

/**
 *
 * @author LeoAddinall_ST10441154_ST10441154@vcconnect.edu.za
 */
public class Login {

    // Variables to track if the username and password are valid
    public static boolean ValidPassword;
    public static boolean ValidLoginUser;

    //Method to prompt the user for their username and validate it.
    //Own code
    public static void LoginUser() {

        // Get the stored username from the UserInput class
        String storedUsername = UserInput.userInfo.getUserName();

        // Loop until a valid username is entered
        while (!ValidLoginUser) {

            // Prompt the user to enter their username
            String loginUserName = JOptionPane.showInputDialog(null, "Enter your your username");

            // Check if the entered username matches the stored username           
            if (loginUserName.equals(storedUsername)) {

                // If the username is correct, display a message and set ValidLoginUser to true
                JOptionPane.showMessageDialog(null, "Username is correct");
                ValidLoginUser = true;

                // If the username is incorrect, display a message and set ValidLoginUser to false
            } else {

                JOptionPane.showMessageDialog(null, "Username does not match");
                ValidLoginUser = false;
                break; // Break out of the loop since the username is incorrect

            }
        }
        // Once a valid username is entered, proceed to prompt for the password
        LoginPassword();
    }

    //----------------------------------------------------------------------------------------------------
    //Own code
    public static void LoginPassword() {
        // Get the stored password from the UserInput class
        String storedPassword = UserInput.userInfo.getPassWord();

        // Loop until a valid password is entered
        while (!ValidPassword) {

            // Prompt the user to enter their password
            String loginPassword = JOptionPane.showInputDialog(null, "what is your Password");

            // Check if the entered password matches the stored password
            if (loginPassword.equals(storedPassword)) {

                // If the password is correct, display a message and set ValidPassword to true
                JOptionPane.showMessageDialog(null, "password is correct");
                ValidPassword = true;

            } else {

                // If the password is incorrect, display a message and set ValidPassword to false
                JOptionPane.showMessageDialog(null, "Password does not match");
                ValidPassword = false;
                break;// Break out of the loop since the password is incorrect

            }

        }
        // Once a valid password is entered, check the login status
        returLoginStatus();
    }

    //----------------------------------------------------------------------------------------------------
    // Method to return the login status and provide appropriate messages.  
    //Own Code
    public static void returLoginStatus() {

        // Check if both the username and password are valid
        if (ValidLoginUser && ValidPassword) {

            // If both are valid, display a success message
            JOptionPane.showMessageDialog(null, "A successful login");
            JOptionPane.showMessageDialog(null, "Welcome " + UserInput.userInfo.getFirstName() + " " + UserInput.userInfo.getLastName() + " is is great to see you again ");
        } else {

            // If either the username or password is incorrect, display a failure message
            JOptionPane.showMessageDialog(null, "A failed login");
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");

            ValidPassword = false; // Reset the password validation status
            ValidLoginUser = false; // Reset the username validation status
            LoginUser(); // Prompt the user to login again
        }
    }
}
//----------------------------END OF FILE----------------------------------------------//
