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
        boolean result = passwordValidator.validate("123456789");
        assertTrue(result);
    }



}
