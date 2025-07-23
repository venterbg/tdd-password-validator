package org.example;

import java.util.List;

public interface IPasswordValidator {
    List<String> validate();

    PasswordValidator isGreaterThanMinimumLength(int minimumLength);

    PasswordValidator isLessThanMaxLength(int maximumLength);

    PasswordValidator containsUppercaseLetter();

    PasswordValidator containsLowercaseLetter();

    PasswordValidator containsNumber();

    PasswordValidator containsSpecialCharacter(String s);
}
