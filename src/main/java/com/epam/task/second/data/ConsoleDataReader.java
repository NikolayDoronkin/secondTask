package com.epam.task.second.data;

import com.epam.task.second.validate.Validator;
import org.apache.log4j.Logger;

public class ConsoleDataReader implements DataReader {

    private final static Logger LOGGER = Logger.getLogger(ConsoleDataReader.class);

    public final String readData(final String data) {
        LOGGER.info("Reading data from CONSOLE was started.");
        Validator validator = new Validator();
        if (!validator.validateStringLine(data)) {
            LOGGER.error("Lines failed validation.");
            return null;
        }
        LOGGER.info("Reading data from CONSOLE was finished successful.");
        return data;
    }
}
