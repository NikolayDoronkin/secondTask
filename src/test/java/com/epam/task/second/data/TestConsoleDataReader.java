package com.epam.task.second.data;

import org.junit.Assert;
import org.junit.Test;

public class TestConsoleDataReader {

    @Test
    public void testReadDataFromConsoleWithCorrectValues(){
        ConsoleDataReader consoleDataReader = new ConsoleDataReader();
        String expected = "PAPA214edlsrg defr 1345 12rf aout puto";

        String actual = consoleDataReader.readData(expected);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadDataFromConsoleWithoutCorrectValues(){
        ConsoleDataReader consoleDataReader = new ConsoleDataReader();
        String expected = "PAPA214edlsrg defr 1345 12rf aout puto";

        String actual = consoleDataReader.readData("$%^&*(*&^%$#$%^&*(*&^%$");
        assert actual != null;
        boolean result = actual.equals(expected);
        Assert.assertFalse(result);
    }
}
