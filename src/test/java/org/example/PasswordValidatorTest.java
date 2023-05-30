package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    @Test
    public void validate_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .isGreaterThanMinimumLength(8)
                .isLessThanMaxLength(16)
                .containsUppercaseLetter()
                .containsLowercaseLetter()
                .containsNumber()
                .containsSpecialCharacter("_&#!?@")
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void validate_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("");
        List<String> result = passwordValidator
                .isGreaterThanMinimumLength(8)
                .containsUppercaseLetter()
                .containsLowercaseLetter()
                .containsNumber()
                .containsSpecialCharacter("_&#!?@")
                .validate();
        assertTrue(result.contains("Password must be at least 8 characters long"));
        assertTrue(result.contains("Password must contain at least one capital letter"));
        assertTrue(result.contains("Password must contain at least one lowercase letter"));
        assertTrue(result.contains("Password must contain at least one number"));
        assertTrue(result.contains("Password must contain at least one special character"));
    }

    @Test
    public void isGreaterThanMinimumLength_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .isGreaterThanMinimumLength(8)
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void isGreaterThanMinimumLength_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("1234567");
        List<String> result = passwordValidator
                .isGreaterThanMinimumLength(8)
                .validate();
        assertTrue(result.contains("Password must be at least 8 characters long"));
    }

    @Test
    public void isLessThanMaxLength_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .isLessThanMaxLength(16)
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void isLessThanMaxLength_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_123456789Aa_");
        List<String> result = passwordValidator
                .isLessThanMaxLength(16)
                .validate();
        assertTrue(result.contains("Password must be less than 16 characters long"));
    }

    @Test
    public void containsUppercaseLetter_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .containsUppercaseLetter()
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void containsUppercaseLetter_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789a_");
        List<String> result = passwordValidator
                .containsUppercaseLetter()
                .validate();
        assertTrue(result.contains("Password must contain at least one capital letter"));
    }

    @Test
    public void containsLowercaseLetter_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .containsLowercaseLetter()
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void containsLowercaseLetter_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789A_");
        List<String> result = passwordValidator
                .containsLowercaseLetter()
                .validate();
        assertTrue(result.contains("Password must contain at least one lowercase letter"));
    }

    @Test
    public void containsNumber_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .containsNumber()
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void containsNumber_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("abcdefghiAa_");
        List<String> result = passwordValidator
                .containsNumber()
                .validate();
        assertTrue(result.contains("Password must contain at least one number"));
    }

    @Test
    public void containsSpecialCharacter_Success() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                .containsSpecialCharacter("_&#!?@")
                .validate();
        assertTrue(result.isEmpty());
    }

    @Test
    public void containsSpecialCharacter_Failure() {
        PasswordValidator passwordValidator = new PasswordValidator("123456789Aa");
        List<String> result = passwordValidator
                .containsSpecialCharacter("_&#!?@")
                .validate();
        assertTrue(result.contains("Password must contain at least one special character"));
    }

}
