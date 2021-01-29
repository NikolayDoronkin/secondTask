package com.epam.task.second.validate;

import org.junit.Assert;
import org.junit.Test;

public class TestValidator {

    @Test
    public void testValidateStringLineCorrect(){
        String line = "aejfn aefnaeskofjs jsefionf";
        Validator validator = new Validator();

        boolean expected = validator.validateStringLine(line);

        Assert.assertTrue(expected);
    }

}
