package org.example;

public class PasswordValidator_Validation2 implements IPasswordValidator, IPasswordRules {
    public static final int MINIMUM_PASSWORD_LENGTH = 6;

    public boolean validate(String password) {

        return isGreaterThanMinimumLength(password, MINIMUM_PASSWORD_LENGTH) &&
                containsUppercaseLetter(password) &&
                containsLowercaseLetter(password) &&
                containsNumber(password);
    }
}
