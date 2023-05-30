package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
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
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.isValidLength("123456789");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsCapitalLetter() {
        //write a test that checks if the password contains a capital letter
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.containsCapitalLetter("123456789A");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsLowercaseLetter() {
        //write a test that checks if the password contains a lowercase letter
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.containsLowercaseLetter("123456789Aa");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsNumber() {
        //write a test that checks if the password contains a number
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.containsNumber("123456789Aa1");
        assertTrue(result);
    }

    @Test
    public void testPasswordContainsUnderscore() {
        //write a test that checks if the password contains an underscore
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.containsUnderscore("123456789Aa_");
        assertTrue(result);
    }

    @Test
    public void testPasswordIsValid() {
        //write a test that checks if the password is valid
        MyPasswordValidator passwordValidator = new MyPasswordValidator();
        boolean result = passwordValidator.validate("123456789Aa_");
        assertTrue(result);
    }
}
