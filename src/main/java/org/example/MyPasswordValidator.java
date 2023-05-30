package org.example;

public class MyPasswordValidator implements PasswordValidator{
    public static final int MINIMUM_PASSWORD_LENGTH = 8;
    private boolean isValidLength(String password) {
        return password.length() > MyPasswordValidator.MINIMUM_PASSWORD_LENGTH;
    }

    public boolean validate(String password) {
        return isValidLength(password);
    }
}

