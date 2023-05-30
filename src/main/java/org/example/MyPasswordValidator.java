package org.example;

public class MyPasswordValidator implements PasswordValidator{
    public static final int MINIMUM_PASSWORD_LENGTH = 8;
    boolean isValidLength(String password) {
        return password.length() > MyPasswordValidator.MINIMUM_PASSWORD_LENGTH;
    }

    public boolean validate(String password) {
        return isValidLength(password);
    }

    public boolean containsCapitalLetter(String password) {
        return password.matches(".*[A-Z].*");
    }

    public boolean containsLowercaseLetter(String s) {
        return s.matches(".*[a-z].*");
    }
}

