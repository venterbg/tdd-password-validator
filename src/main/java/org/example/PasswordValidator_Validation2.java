package org.example;

public class PasswordValidator_Validation2 implements IPasswordValidator, IPasswordRules {
    public static final int MINIMUM_PASSWORD_LENGTH = 6;

    public boolean validate(String password) {

        return isValidLength(password, MINIMUM_PASSWORD_LENGTH) &&
                containsCapitalLetter(password) &&
                containsLowercaseLetter(password) &&
                containsNumber(password);
    }
}
