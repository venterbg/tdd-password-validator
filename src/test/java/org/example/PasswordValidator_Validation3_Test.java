package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidator_Validation3_Test {

    @Test
    void validate_Valid() {
        PasswordValidator_Validation3 passwordValidator = new PasswordValidator_Validation3();
        boolean result = passwordValidator.validate("123456789111111Aa_");
        assertTrue(result);
    }

    @Test
    void validate_InValid() {
        PasswordValidator_Validation3 passwordValidator = new PasswordValidator_Validation3();
        boolean result = passwordValidator.validate("123456789");
        assertFalse(result);
    }
}