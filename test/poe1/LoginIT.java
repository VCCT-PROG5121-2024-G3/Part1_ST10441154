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
public class LoginIT {

   

        private UserInfo userInfo;

        @Before
        public void setUp() {
            //Initialize user information before each test
            userInfo = new UserInfo();
            userInfo.setUserName("kyl_1");
            userInfo.setPassWord("Ch&&sec@ke99!");
        }

        @Test
        public void testLoginUser_Successful() {
            // Test a successful login Username attempt with valid credentials
            assertTrue(Login.ValidLoginUser);
        }

        @Test
        public void testLoginUser_Failed() {
            // Test a failed login Username attempt with invalid credentials
            assertFalse(Login.ValidLoginUser);
        }

        @Test
        public void testLoginPassword_Successful() {
            // Test a successful login password attempt with valid credentials
            assertTrue(Login.ValidPassword);
        }

        @Test
        public void testLoginPassword_Failed() {
            // Test a failed login password attempt with invalid credentials
            assertFalse(Login.ValidPassword);
        }
    }

