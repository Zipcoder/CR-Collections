package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.Element;
import java.util.*;

public class WCTest {

    @Test
    public void wcTest() {
        WC wc = new WC("/Users/madelinebowe/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/test");

        String expected = "{the=8, quick=2, brown=2, over=1, lazy=1, jumped=1, dog=1, fox=1}";
        String actual = wc.getWordCount().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wcTest2() {
        WC wc = new WC("/Users/madelinebowe/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/test");
        Map<String ,Integer> test = wc.getWordCount();

        Integer expected = 8;
        Integer actual = test.get("the");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wcTest3() {
        WC wc = new WC("/Users/madelinebowe/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/test");
        Map<String ,Integer> test = wc.getWordCount();

        Integer expected = 2;
        Integer actual = test.get("quick");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wcTest4() {
        WC wc = new WC("/Users/madelinebowe/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/test");
        Map<String ,Integer> test = wc.getWordCount();

        Assert.assertFalse(test.containsKey("The"));
    }
}