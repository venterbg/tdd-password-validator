package org.example;

public class MyPasswordValidator implements PasswordValidator{
    public boolean validate(String password) {
        return password.length() > 8;
    }
}

