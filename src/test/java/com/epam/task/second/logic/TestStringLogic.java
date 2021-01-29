package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class TestStringLogic {

    @Test
    public void testReplaceSymbolAt(){
        String line = "qwerty asdfgh zxcvbn";
        StringLogic stringLogic = new StringLogic();

        String expected = "pwerty asdfgh zxcvbn";
        String actual = stringLogic.replaceSymbolAt(line, 0, 'p');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCorrectSymbolAfterSymbolP(){
        String line = "Pickachu PAckachu PAPAP";
        StringLogic stringLogic = new StringLogic();

        String expected = "Pickachu POckachu POPOP";
        String actual = stringLogic.correctSymbolAfterSymbolP(line);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWords(){
        String line = "Pickachu PAckachu PAPAP";
        StringLogic stringLogic = new StringLogic();

        String expected = "Pickachu PAckachu test";
        String actual = stringLogic.replaceWords(line, 5, "test");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceAllSymbolsApartLettersAndSpaces(){
        String line = "qwijer324 e43243434 dw";
        StringLogic stringLogic = new StringLogic();

        String expected = "q w i j e r e d w";
        String actual = stringLogic.replaceAllSymbolsApartLettersAndSpaces(line);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWordsBySizeAndFirstSymbol(){
        String line = "aoirsoigns tosknfo uenfef uenfef";
        StringLogic stringLogic = new StringLogic();

        String expected = "aoirsoigns uenfef uenfef";
        String actual = stringLogic.replaceWordsBySizeAndFirstSymbol(line, 7);

        Assert.assertEquals(expected, actual);
    }

}
