package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidator_Validation1_Test {
    //write a test that checks if the password is longer than 8 characters
    //write a test that checks if the password contains a capital letter
    //write a test that checks if the password contains a lowercase letter
    //write a test that checks if the password contains a number
    //write a test that checks if the password contains an underscore
    //write a test that checks if the password is valid
    //write a test that checks if the password is invalid


    @Test
    public void testPasswordLength() {
        //write a test that checks if the password is longer than 8 characters
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.isGreaterThanMinimumLength("123456789", 8);
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsCapitalLetter() {
        //write a test that checks if the password contains a capital letter
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.containsUppercaseLetter("123456789A");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsLowercaseLetter() {
        //write a test that checks if the password contains a lowercase letter
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.containsLowercaseLetter("123456789Aa");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsNumber() {
        //write a test that checks if the password contains a number
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.containsNumber("123456789Aa1");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsUnderscore() {
        //write a test that checks if the password contains an underscore
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.containsUnderscore("123456789Aa_");
        assertTrue(result);
    }

    @Test
    public void testPasswordIsValid() {
        //write a test that checks if the password is valid
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.validate("123456789Aa_");
        assertTrue(result);
    }

    @Test
    public void testPasswordIsInvalid() {
        //write a test that checks if the password is invalid
        PasswordValidator_Validation1 passwordValidator = new PasswordValidator_Validation1();
        boolean result = passwordValidator.validate("123456789Aa");
        assertFalse(result);
    }
}
