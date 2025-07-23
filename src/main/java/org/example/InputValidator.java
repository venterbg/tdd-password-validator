package org.example;

import java.util.ArrayList;
import java.util.List;

public class InputValidator  {
    private final List<String> messages;
    private final String inputString;

    public InputValidator (String inputString) {
        this.inputString = inputString;
        messages = new ArrayList<>();
    }
        public InputValidator isValidLength(int minimumLength) {
            if (inputString.length() < minimumLength) {
                messages.add("Input must be at least " + minimumLength + " characters long.");
            }
            return this;
        }

        /**
         * Checks if the input contains at least one uppercase letter.
         *
         * @return this InputValidator instance.
         */
        public InputValidator containsUpperCase() {
            if (!inputString.matches(".*[A-Z].*")) {
                messages.add("Input must contain at least one uppercase letter.");
            }
            return this;
        }

        public InputValidator containsLowerCase() {
            if (!inputString.matches(".*[a-z].*")) {
                messages.add("Input must contain at least one lowercase letter.");
            }
            return this;
        }

        public InputValidator containsNumber() {
            if (!inputString.matches(".*[0-9].*")) {
                messages.add("Input must contain at least one number.");
            }
            return this;
        }

        public InputValidator containsUnderscore() {
            if (!inputString.matches(".*[_].*")) {
                messages.add("Input must contain at least one underscore.");
            }
            return this;
        }

        public List<String> validate() {
            return this.messages;
        }
}
