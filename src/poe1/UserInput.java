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
public class UserInput {

    public static boolean ValideUser;
    public static UserInfo userInfo = new UserInfo();

    //Own code
    public static void Name() {
        // Prompt for user's first name
        String name = JOptionPane.showInputDialog(null, "what is your Name ");

        // Prompt for user's last name
        String lastName = JOptionPane.showInputDialog(null, "what is your Surname ");

        // Set user's first name
        userInfo.setFirstName(name);
        // Set user's last name
        userInfo.setLastName(lastName);

        // Call method to process user's name
        UsersName();
    }

//----------------------------------------------------------------------------------------------------    
    //Code from chatgpt
    public static boolean CheckUsername(String username) {
        // Check if the username contains an underscore and is no more than 5 characters long
        return username != null && username.length() <= 5 && username.contains("_");
    }

//----------------------------------------------------------------------------------------------------    
    //Own code
    public static void UsersName() {

        boolean validUsername = false;
        String username;

        //looping until a valid username is entered
        while (!validUsername) {

            //asking user for a username     
            username = JOptionPane.showInputDialog("Create your username: \n Ensure Username contains an underscore and is no more than 5 characters long");

            // Check if the entered username meets th requirements
            if (CheckUsername(username)) {

                userInfo.setUserName(username);

                //infroms the user that the the username meets the requirements
                JOptionPane.showMessageDialog(null, "Username successfully captured");

                validUsername = true; // Set to true to break out of the loop

            } else {
                // If not valid, inform the user and continue the loop    
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");

            }
        }
        // Move to the password input step
        Password();
    }

//----------------------------------------------------------------------------------------------------
    
    //Code from chatgpt
    public static boolean CheckPasswordComplexty(String PassWord) {

        // Check if the username contains an underscore and is no more than 5 characters long
        return PassWord != null && PassWord.length() >= 8
                && PassWord.matches(".*[A-Z].*")
                && // At least one uppercase letter
                PassWord.matches(".*\\d.*")
                && // At least one digit
                PassWord.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"); // At least one special character
    }

//----------------------------------------------------------------------------------------------------
    //Own code
    public static void Password() {

        boolean validPassWord = false;
        // Loop until a valid password is entered
        while (!validPassWord) {
            // Prompt the user to enter a password
            String PassWord = JOptionPane.showInputDialog("Create a password, please ensure that your password contains at least 8 characters, a capital letter, a number and a special character");
            // Check if the entered password meets the specified criteria
            if (CheckPasswordComplexty(PassWord)) {
                // If the password is valid, set it in the UserInfo object
                userInfo.setPassWord(PassWord);
                // Inform the user that the password has been successfully captured
                JOptionPane.showMessageDialog(null, "Password successfully captured");
                // Set validPassWord to true to exit the loop
                validPassWord = true;

            } else {
                // If the password is not valid, display an error message to the user
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that your password contains at least 8 characters, a capital letter, a number and a special character");
            }
        }

    }

}
//----------------------------END OF FILE----------------------------------------------//
