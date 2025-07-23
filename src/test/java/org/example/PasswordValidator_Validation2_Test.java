package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidator_Validation2_Test {

    @Test
    void validate_Valid() {
        PasswordRulesValidator_Validation2 passwordValidator = new PasswordRulesValidator_Validation2();
        boolean result = passwordValidator.validate("123456789Aa");
        assertTrue(result);
    }

    @Test
    void validate_InValid() {
        PasswordRulesValidator_Validation2 passwordValidator = new PasswordRulesValidator_Validation2();
        boolean result = passwordValidator.validate("123456789");
        assertFalse(result);
    }
}