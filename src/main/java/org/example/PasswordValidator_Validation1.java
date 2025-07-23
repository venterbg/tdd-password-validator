package org.example;

public class PasswordValidator_Validation1 implements IPasswordValidator, IPasswordRules {
    public static final int MINIMUM_PASSWORD_LENGTH = 8;

    public boolean validate(String password) {
        return isGreaterThanMinimumLength(password, MINIMUM_PASSWORD_LENGTH) &&
                containsUppercaseLetter(password) &&
                containsLowercaseLetter(password) &&
                containsNumber(password) &&
                containsUnderscore(password);
    }

}

