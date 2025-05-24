# Password Validator

## Description

This is a simple Java application that validates a password based on a predefined set of rules. It's built using Gradle.

The main validation logic is implemented in the `org.example.DefaultPasswordValidator` class.

## Password Rules

A valid password must meet the following criteria:
- Be longer than 8 characters.
- Contain at least one capital letter (A-Z).
- Contain at least one lowercase letter (a-z).
- Contain at least one number (0-9).
- Contain at least one underscore character (_).

## How to Use

### Prerequisites
- Java Development Kit (JDK) installed (version 11 or higher recommended).
- Gradle installed (or use the included Gradle wrapper `gradlew`).

### Compilation
To compile the project, navigate to the root directory of the project in your terminal and run:
```bash
./gradlew build
```
On Windows, you might need to use:
```bash
.\gradlew.bat build
```

### Running the Application
After successful compilation, you can run the application from the command line. You need to provide the password you want to validate as a command-line argument.

Navigate to the root directory and run:
```bash
./gradlew run --args="your_password_here"
```
Or, if you want to run the compiled JAR directly (after building):
```bash
java -cp build/classes/java/main org.example.Main your_password_here
```

Replace `"your_password_here"` with the actual password you want to validate.

**Example:**
```bash
./gradlew run --args="ValidPass_123"
```

The application will output whether the provided password is valid or not.
