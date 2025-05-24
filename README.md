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


## Running with Docker

You can also build and run this application using Docker.

1.  **Build the Docker Image:**
    Navigate to the project root directory (where the `Dockerfile` is located) and run:
    ```bash
    docker build -t password-validator-service .
    ```

2.  **Run the Docker Container:**
    Once the image is built, run it with:
    ```bash
    docker run -p 7070:7070 password-validator-service
    ```
    This will start the service and map port 7070 on your host to port 7070 in the container.

## API Usage

The service exposes a POST endpoint for password validation.

*   **Endpoint:** `/validate`
*   **Method:** `POST`
*   **Request Body:** JSON object with a "password" field.
    ```json
    {
        "password": "your_password_here"
    }
    ```
*   **Response Body:** JSON object indicating validity.
    *   Success (HTTP 200):
        ```json
        {
            "isValid": true
        }
        ```
        or
        ```json
        {
            "isValid": false
        }
        ```
    *   Error (HTTP 400 - e.g., bad request, missing password):
        ```json
        {
            "isValid": false 
        }
        ```

**Example `curl` command:**

```bash
curl -X POST -H "Content-Type: application/json" -d '{"password":"Test_123"}' http://localhost:7070/validate
```

This command will send a POST request to the running service (either run directly or via Docker) and return a JSON response.
