/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Poe1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LeoAddinall_ST10441154_ST10441154@vcconnect.edu.za
 */
public class UserInputIT {

    private UserInfo userInfo; // Object to hold user information

    @Before
    public void setUp() {
        
        // Initialize user information before each test
        userInfo = new UserInfo();
    }

    @Test
    public void testCheckUsername_CorrectlyFormatted() {
        // Test a correctly formatted username
        assertTrue(UserInput.CheckUsername("kyl_1"));
    }

    @Test
    public void testCheckUsername_IncorrectlyFormatted() {
        // Test an incorrectly formatted username
        assertFalse(UserInput.CheckUsername("kyle!!!!!!!"));
    }

    @Test
    public void testCheckPasswordComplexity_ValidPassword() {
        // Test a valid password with sufficient complexity
        assertTrue(UserInput.CheckPasswordComplexty("Ch&&sec@ke99!"));
    }

    @Test
    public void testCheckPasswordComplexity_InvalidPassword() {
        // Test an invalid password with insufficient complexity
        assertFalse(UserInput.CheckPasswordComplexty("password"));
    }
}
