package org.example;


public class Main {
    public static void main(String[] args) {
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

        DefaultPasswordValidator validator = new DefaultPasswordValidator();

        if (args.length == 0) {
            System.out.println("Usage: java org.example.Main <password>");
            return;
        }

        String password = args[0];
        boolean isValid = validator.validate(password);

        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }

}