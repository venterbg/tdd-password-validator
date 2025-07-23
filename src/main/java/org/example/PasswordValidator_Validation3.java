package org.example;

public class PasswordValidator_Validation3 implements IPasswordValidator, IPasswordRules {
    public static final int MINIMUM_PASSWORD_LENGTH = 16;

    public boolean validate(String password) {
        return isGreaterThanMinimumLength(password, MINIMUM_PASSWORD_LENGTH) &&
                containsUppercaseLetter(password) &&
                containsLowercaseLetter(password) &&
                containsUnderscore(password);
    }

}
