package org.example;

import io.javalin.Javalin;
// It's good practice to explicitly import the validator if it's in the same package,
// but not strictly necessary if it's public and in the same package.
// import org.example.DefaultPasswordValidator; 

public class Main {

    // Inner class for JSON request mapping
    static class PasswordRequest {
        public String password;
    }

    // Inner class for JSON response mapping
    static class ValidationResponse {
        public boolean isValid;
        public ValidationResponse(boolean isValid) {
            this.isValid = isValid;
        }
    }

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

        Javalin app = Javalin.create(config -> {
            // Javalin uses Jackson by default, which is fine for this use case.
            // No specific jsonMapper configuration needed unless advanced features are required.
        }).start(7070);

        app.get("/", ctx -> ctx.result("Password Validator service is running!"));

        // Instantiate the validator
        DefaultPasswordValidator passwordValidator = new DefaultPasswordValidator();

        // Add the POST /validate endpoint
        app.post("/validate", ctx -> {
            try {
                PasswordRequest request = ctx.bodyAsClass(PasswordRequest.class);
                
                // Check if the password field is present and not empty
                if (request.password == null || request.password.isEmpty()) {
                    ctx.status(400).json(new ValidationResponse(false)); // Bad Request
                    return;
                }
                
                boolean isValid = passwordValidator.validate(request.password);
                ctx.json(new ValidationResponse(isValid));
            } catch (Exception e) {
                // Handle cases where body is not valid JSON or other parsing errors
                // For example, if the JSON structure is incorrect or 'password' field is missing.
                ctx.status(400).json(new ValidationResponse(false)); // Bad Request
            }
        });
    }

}