package org.example;

public interface PasswordRules {
    default boolean isValidLength(String password, int minimumPasswordLength) {
            return password.length() > minimumPasswordLength;
    }

    default boolean containsCapitalLetter(String password) {
            return password.matches(".*[A-Z].*");
    }

    default boolean containsLowercaseLetter(String s) {
            return s.matches(".*[a-z].*");
    }

    default boolean containsNumber(String s) {
            return s.matches(".*[0-9].*");
    }

    default boolean containsUnderscore(String s) {
            return s.matches(".*[_].*");
    }
}
