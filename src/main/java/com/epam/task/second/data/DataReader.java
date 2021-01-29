package com.epam.task.second.data;

import java.io.IOException;

public interface DataReader {

    public String readData(final String line) throws IOException;

}
