package org.example;

public class MyPasswordValidator implements PasswordValidator, PasswordRules {
    public static final int MINIMUM_PASSWORD_LENGTH = 8;

    public boolean validate(String password) {
        return isValidLength(password, MINIMUM_PASSWORD_LENGTH) &&
                containsCapitalLetter(password) &&
                containsLowercaseLetter(password) &&
                containsNumber(password) &&
                containsUnderscore(password);
    }

}

