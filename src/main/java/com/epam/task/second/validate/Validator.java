package com.epam.task.second.validate;

public class Validator {

    private static final String REGEX_VALID_WORD = "\\s*[\\w\\d]+\\s*";

    public boolean validateStringLine(String line) {
        return !line.matches(REGEX_VALID_WORD);
    }

}
