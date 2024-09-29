/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registrationAndLogin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SignUpTest {
    
    @Test
    public void testUsernameCorrectFormat() {
        SignUp signUp = new SignUp();
        assertTrue(signUp.checkUserName("kyl_1"));
    }
    
    @Test
    public void testUsernameIncorrectFormat() {
        SignUp signUp = new SignUp();
        assertFalse(signUp.checkUserName("kyle!!!!!!!"));
    }
    
    @Test
    public void testPasswordMeetsComplexityRequirements() {
        SignUp signUp = new SignUp();
        assertTrue(signUp.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        SignUp signUp = new SignUp();
        assertFalse(signUp.checkPasswordComplexity("password"));
    }
}