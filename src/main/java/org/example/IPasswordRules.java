package org.example;

public interface IPasswordRules {
    default boolean isValidLength(String password, int minimumPasswordLength) {
            return password.length() > minimumPasswordLength;
    }

    default boolean containsCapitalLetter(String password) {
            return password.matches(".*[A-Z].*");
    }

    default boolean containsLowercaseLetter(String password) {
            return password.matches(".*[a-z].*");
    }

    default boolean containsNumber(String password) {
            return password.matches(".*[0-9].*");
    }

    default boolean containsUnderscore(String password) {
            return password.matches(".*[_].*");
    }
}
