package com.epam.task.second.data;

import org.apache.log4j.Logger;

public class DataChooser {

    private final static Logger LOGGER = Logger.getLogger(DataChooser.class);

    public final DataReader choose(final ReaderChooser choice) {
        LOGGER.info("Choosing type of reading.");
        switch (choice) {
            case FILE:
                LOGGER.info("Type of reading is FILE.");
                return new FileDataReader();
            case CONSOLE:
                LOGGER.info("Type of reading is CONSOLE.");
                return new ConsoleDataReader();
            default:
                LOGGER.error("Type of reading is UNKNOWN.");
                throw new IllegalArgumentException("Unknown choice = " + choice);
        }
    }

}
