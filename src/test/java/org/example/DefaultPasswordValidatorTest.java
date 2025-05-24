package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultPasswordValidatorTest {
    private final DefaultPasswordValidator validator = new DefaultPasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.validate("ValidPass_123")); // Length 13, has uppercase, lowercase, number, underscore
    }

    @Test
    void testPasswordTooShort() {
        // MINIMUM_PASSWORD_LENGTH is 8. Password must be > 8.
        assertFalse(validator.validate("Short_1")); // Length 7
        assertFalse(validator.validate("Short_12")); // Length 8
    }

    @Test
    void testPasswordMissingUppercase() {
        assertFalse(validator.validate("nouppercase_123"));
    }

    @Test
    void testPasswordMissingLowercase() {
        assertFalse(validator.validate("NOLOWERCASE_123"));
    }

    @Test
    void testPasswordMissingNumber() {
        assertFalse(validator.validate("NoNumberPass_"));
    }

    @Test
    void testPasswordMissingUnderscore() {
        assertFalse(validator.validate("NoUnderscore123"));
    }
}
