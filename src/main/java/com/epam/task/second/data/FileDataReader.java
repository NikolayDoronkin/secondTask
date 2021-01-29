package com.epam.task.second.data;

import com.epam.task.second.validate.Validator;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDataReader implements DataReader {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    public final String readData(final String fileName) throws IOException {
        try {
            LOGGER.info("Read data from FILE was started.");
            String resultLine = "";
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);

            Validator validator = new Validator();

            while (scanner.hasNextLine()) {
                LOGGER.info("Lines readied.");
                resultLine += scanner.nextLine();
            }
            fileReader.close();

            if (!validator.validateStringLine(resultLine)) {
                LOGGER.error("Lines failed validation.");
                return null;
            }

            LOGGER.info("Reading data from FILE was finished successful.");
            return resultLine;


        } catch (IOException e) {
            LOGGER.info("This file is not exist.");
            throw new IOException(e.getMessage(), e);
        }

    }
}
