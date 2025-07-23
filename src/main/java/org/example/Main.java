package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IPasswordRulesValidator passwordRulesValidator = new PasswordRulesValidator_Validation1();
        if (passwordRulesValidator.validate("123456789Aa_"))
            System.out.println("Password is valid");
        else System.out.println("Password is invalid");

        IPasswordValidator passwordValidator = new PasswordValidator("123456789Aa_");
        List<String> result = passwordValidator
                                .isGreaterThanMinimumLength(8)
                                .containsUppercaseLetter()
                                .containsLowercaseLetter()
                                .containsNumber()
                                .containsSpecialCharacter("!?@")
                                .validate();
        if (result.isEmpty()) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }

        //Design and implement an application that validates a password applying TDD.
        //The password will be introduced by the user (as an argument of the method) and should return if the password is valid or not.
        //A valid password should meet the following requirements:
        //Have more than 8 characters
        //Contains a capital letter
        //Contains a lowercase
        //Contains a number
        //Contains an underscore
        //Technical requirements:
        //We want a method that answers if the password is valid or not.
        //We don't want to know the reason when the password is invalid (the return value is a boolean)


    }

}