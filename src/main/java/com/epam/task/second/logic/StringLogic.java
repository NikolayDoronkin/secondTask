package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class StringLogic {

    private static final Logger LOGGER = Logger.getLogger(StringLogic.class);
    private static final String REGEX_SPACE = "\\s+";
    private static final String REGEX_WITHOUT_LETTERS_AND_SPASE = "[\\W\\d\\s]+";
    private static final String REGEX_WORDS_STARTED_WITH_CONSONANT
            = "(b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z)[\\w]+";

    public final String replaceSymbolAt(final String line, final int index, final char element) {
        LOGGER.info("Method 'replaceSymbolAt' was started.");
        String resultLine = line;
        if (!(index >= 0 && index < resultLine.length())) {
            LOGGER.info("Method 'replaceSymbolAt' was finished.");
            return resultLine;
        }
        resultLine = line.substring(0, index) + element + line.substring(index + 1);
        LOGGER.info("Method 'replaceSymbolAt' was finished.");
        return resultLine;
    }

    public final String correctSymbolAfterSymbolP(final String line) {
        LOGGER.info("Method 'correctSymbolAfterSymbolP' was started.");
        String resultLine = line;
        for (int index = 0; index < resultLine.length() - 1; index++) {
            char symbol = line.charAt(index);
            if (symbol == 'P') {
                LOGGER.info("Symbol 'P' was founded.");
                resultLine = correctMistake(resultLine, index + 1);
            }
        }
        LOGGER.info("Method 'correctSymbolAfterSymbolP' was finished.");
        return resultLine;
    }

    public final String replaceWords(final String line, int wordSize, final String futureWord) {
        LOGGER.info("Method 'replaceWords' was started.");
        String[] stringArray = line.split(REGEX_SPACE);
        for (int index = 0; index < stringArray.length; index++) {
            if (stringArray[index].length() == wordSize) {
                LOGGER.info("Equality between wordSize and arrays element's size.");
                stringArray[index] = futureWord;
            }
        }
        LOGGER.info("Method 'replaceWords' was finished.");
        return makeString(stringArray);
    }

    public final String replaceAllSymbolsApartLettersAndSpaces(final String line) {
        LOGGER.info("Method 'replaceAllSymbolsApartLettersAndSpaces' was started.");
        String resultLine = line.replaceAll(REGEX_WITHOUT_LETTERS_AND_SPASE, "");
        resultLine = resultLine.replaceAll(REGEX_SPACE, " ");
        LOGGER.info("Method 'replaceAllSymbolsApartLettersAndSpaces' was finished.");
        return resultLine.trim();
    }

    public final String replaceWordsBySizeAndFirstSymbol(final String line, int wordSize) {
        LOGGER.info("Method 'replaceWordsBySizeAndFirstSymbol' was started.");
        String[] stringArray = line.split(REGEX_SPACE);
        for (int index = 0; index < stringArray.length; index++) {
            stringArray[index] = correctWordByCondition(stringArray[index]);
        }
        LOGGER.info("Method 'replaceWordsBySizeAndFirstSymbol' was finished.");
        return makeString(stringArray);
    }

    private String correctWordByCondition(String line) {
        LOGGER.info("Method 'correctWordByCondition' was started.");

        if (line.matches(REGEX_WORDS_STARTED_WITH_CONSONANT)) {
            LOGGER.info("The first letter is consonant.");
            return "";
        }
        LOGGER.info("Method 'correctWordByCondition' was finished.");
        return line;
    }

    private String correctMistake(final String line, final int index) {
        LOGGER.info("Method 'correctMistake' was started.");

        String resultLine = line;
        char symbol = line.charAt(index);
        if (symbol == 'A') {
            LOGGER.info("Mistake was founded. Starting to correct it.");
            resultLine = replaceSymbolAt(line, index, 'O');
        }
        LOGGER.info("Method 'correctMistake' was finished.");
        return resultLine;
    }

    private String makeString(String[] arrayString) {
        LOGGER.info("Method 'makeString' was started.");

        String resultLine = "";
        for (String element : arrayString) {
            resultLine += element + " ";
        }
        resultLine = resultLine.trim();
        resultLine = resultLine.replaceAll(REGEX_SPACE, " ");
        LOGGER.info("Method 'makeString' was finished.");
        return resultLine;
    }

}
