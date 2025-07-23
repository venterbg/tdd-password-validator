package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void isValidLength_Success() {
        InputValidator inputValidator = new InputValidator("123456789");
        List<String> result = inputValidator.isValidLength(8).validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void isValidLength_Failure() {
        InputValidator inputValidator = new InputValidator("123");
        List<String> result = inputValidator.isValidLength(8).validate();
        assertTrue(result.contains("Input must be at least 8 characters long."));
    }

    @Test
    void containsCapitalLetter_Success() {
        InputValidator inputValidator = new InputValidator("123456789Aa");
        List<String> result = inputValidator.containsUpperCase().validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void containsCapitalLetter_Failure() {
        InputValidator inputValidator = new InputValidator("123456789a");
        List<String> result = inputValidator.containsUpperCase().validate();
        assertTrue(result.contains("Input must contain at least one capital letter."));
    }

    @Test
    void containsLowerCase_Success() {
        InputValidator inputValidator = new InputValidator("123456789Aa");
        List<String> result = inputValidator.containsLowerCase().validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void containsLowerCase_Failure() {
        InputValidator inputValidator = new InputValidator("123456789A");
        List<String> result = inputValidator.containsLowerCase().validate();
        assertTrue(result.contains("Input must contain at least one lowercase letter."));
    }

    @Test
    void containsNumber_Success() {
        InputValidator inputValidator = new InputValidator("123456789Aa");
        List<String> result = inputValidator.containsNumber().validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void containsNumber_Failure() {
        InputValidator inputValidator = new InputValidator("ABCDEFGHIJ");
        List<String> result = inputValidator.containsNumber().validate();
        assertTrue(result.contains("Input must contain at least one number."));
    }

    @Test
    void containsUnderscore_Success() {
        InputValidator inputValidator = new InputValidator("123456789Aa_");
        List<String> result = inputValidator.containsUnderscore().validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void containsUnderscore_Failure() {
        InputValidator inputValidator = new InputValidator("123456789Aa");
        List<String> result = inputValidator.containsUnderscore().validate();
        assertTrue(result.contains("Input must contain at least one underscore."));
    }

    @Test
    void validate_Success() {
        InputValidator inputValidator = new InputValidator("123456789Aa_");
        List<String> result = inputValidator
                .isValidLength(8)
                .containsUpperCase()
                .containsLowerCase()
                .containsNumber()
                .containsUnderscore()
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    void validate_Failure() {
        InputValidator inputValidator = new InputValidator("");
        List<String> result = inputValidator.isValidLength(8)
                .containsUpperCase()
                .containsLowerCase()
                .containsNumber()
                .containsUnderscore()
                .validate();
        assertEquals(5,result.size());
    }
}