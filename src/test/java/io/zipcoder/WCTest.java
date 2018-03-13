package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class WCTest {

    @Test
    public void incrementValueTest1() {
        WC test = new WC("/Users/vincentgasbarro/Dev/mar12/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        test.getWordMap().put("test" , 1);
        test.incrementValue(test.getWordMap(), "test");
        int expected = 2;
        int actual = test.getWordMap().get("test");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildMapTest() {
        WC test = new WC("/Users/vincentgasbarro/Dev/mar12/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/anotherTextFile");
        test.buildMap();
        int expected = 2;
        int actual = test.getWordMap().get("apple");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayTest() {
        WC test = new WC("/Users/vincentgasbarro/Dev/mar12/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        test.buildMap();
        Object expected = "the";
        Object actual = test.sortMap().get(0).getKey();
        Assert.assertEquals(expected, actual);
        System.out.println(test.display());
    }

    @Test
    public void displayTest2() {
        WC test = new WC("/Users/vincentgasbarro/Dev/mar12/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/ACD");
        test.buildMap();
        int expected = 3311;
        int actual = test.sortMap().get(0).getValue();
        Assert.assertEquals(expected, actual);
        System.out.println(test.display());
    }


}