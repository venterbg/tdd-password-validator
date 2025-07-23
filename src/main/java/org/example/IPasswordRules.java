package org.example;

public interface IPasswordRules {
    default boolean isGreaterThanMinimumLength(String password, int minimumPasswordLength) {
            return password.length() > minimumPasswordLength;
    }

    default boolean isLessThanMaxLength(String password, int maximumPasswordLength) {
            return password.length() < maximumPasswordLength;
    }

    default boolean containsUppercaseLetter(String password) {
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
