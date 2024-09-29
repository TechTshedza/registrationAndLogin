/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registrationAndLogin;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoginTest {
    
    @Test
    public void testLoginSuccessful() {
        Login login = new Login("username", "password");
        assertTrue(login.loginUser("username", "password"));
    }
    
    @Test
    public void testLoginFailed() {
        Login login = new Login("username", "password");
        assertFalse(login.loginUser("wrong_username", "wrong_password"));
    }
}