import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PasswordVerifierTest {

    PasswordVerifier passwordVerifier = new PasswordVerifier();

    @Test
    public void verify() {
        String passwordShort = "toshort";
        String passwortNull = "";
        assertFalse(passwordVerifier.verify(passwortNull));
        assertFalse(passwordVerifier.verify(passwordShort));
    }

    @Test
    public void isUpperCase() {
        String password1 = "imonlylowercase";
        String password2 = "IMONLYUPPERCASE";
        assertFalse(passwordVerifier.isUpperCase(password1));
        assertTrue(passwordVerifier.isUpperCase(password2));
    }

    @Test
    public void isLowerCase() {
        String password1 = "imonlylowercase";
        String password2 = "IMONLYUPPERCASE";
        assertFalse(passwordVerifier.isLowerCase(password2));
        assertTrue(passwordVerifier.isLowerCase(password1));
    }
}
