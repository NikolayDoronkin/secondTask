package com.epam.task.second.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestFileDataReader {

    @Test
    public void testReadDataWithCorrectPath() throws IOException {
        String fileName = "./src/test/resources/input.txt";
        FileDataReader fileDataReader = new FileDataReader();

        String expected = fileDataReader.readData("./src/test/resources/input.txt");
        String actual = "PAPA214edlsrg defr 1345 12rf aout puto";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadDataWithoutCorrectWord() throws IOException {
        String fileName = "./src/test/resources/input.txt";
        FileDataReader fileDataReader = new FileDataReader();

        String expected = fileDataReader.readData("./src/test/resources/input.txt");
        String actual = "PAPA214edlsrg defr 1345 12rf aout";

        boolean result = actual.equals(expected);
        Assert.assertFalse(result);

    }
}
