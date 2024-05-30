
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Poe1;

import poe1.Tasks;

/**
 *
 * @author LeoAddinall_ST10441154_ST10441154@vcconnect.edu.za
 */
public class POE1 {

    /**
     * @param args the command line arguments
     */
    
    //Main Method
    public static void main(String[] args) {
        // Initialize user input
        UserInput userinput = new UserInput();
        userinput.Name();
        
        // Initiate user login
        Login.LoginUser();
        
        Tasks.Option();

    }

}
//----------------------------END OF FILE----------------------------------------------//
