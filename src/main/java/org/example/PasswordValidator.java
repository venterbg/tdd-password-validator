package org.example;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator implements IPasswordValidator {
    protected final List<String> messages;
    protected final String password;

    public PasswordValidator(String password) {
        this.password = password;
        this.messages = new ArrayList<>();
    }

    @Override
    public List<String> validate() {
        return messages;
    }

    @Override
    public PasswordValidator isGreaterThanMinimumLength(int minimumLength) {
        if (password.length() < minimumLength) {
            messages.add("Password must be at least " + minimumLength + " characters long");
        }
        return this;
    }

    @Override
    public PasswordValidator isLessThanMaxLength(int maximumLength) {
        if (password.length() > maximumLength) {
            messages.add("Password must be less than " + maximumLength + " characters long");
        }
        return this;
    }

    @Override
    public PasswordValidator containsUppercaseLetter() {
        if (!password.matches(".*[A-Z].*")) {
            messages.add("Password must contain at least one capital letter");
        }
        return this;
    }

    @Override
    public PasswordValidator containsLowercaseLetter() {
        if (!password.matches(".*[a-z].*")) {
            messages.add("Password must contain at least one lowercase letter");
        }
        return this;
    }

    @Override
    public PasswordValidator containsNumber() {
        if (!password.matches(".*[0-9].*")) {
            messages.add("Password must contain at least one number");
        }
        return this;
    }

    @Override
    public PasswordValidator containsSpecialCharacter(String s) {
        if (!password.matches(".*[" + s + "].*")) {
            messages.add("Password must contain at least one special character");
        }
        return this;
    }
}
