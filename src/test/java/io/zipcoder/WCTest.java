package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WCTest {

    @Test
    public void wordCount() {
        WC wc = new WC("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/TestCaseStory1.txt");
        wc.wordCount();
        String expected = "Word Count in descending order:\n" +
                "\tof: 6\n" +
                "\tand: 5\n" +
                "\tthe: 5\n" +
                "\tit: 2\n" +
                "\tthis: 2\n" +
                "\twas: 2\n" +
                "\tan: 1\n" +
                "\taround: 1\n" +
                "\tattic: 1\n" +
                "\tbig: 1\n" +
                "\tboxes: 1\n" +
                "\tbundles: 1\n" +
                "\tby: 1\n" +
                "\tcarpeting: 1\n" +
                "\tclimbed: 1\n" +
                "\tclothing: 1\n" +
                "\tdamaged: 1\n" +
                "\tdescribe: 1\n" +
                "\tdiscarded: 1\n" +
                "\tdormer: 1\n" +
                "\tends: 1\n" +
                "\tevery: 1\n" +
                "\tfilled: 1\n" +
                "\tfurniture: 1\n" +
                "\tgirl: 1\n" +
                "\thas: 1\n" +
                "\thouse: 1\n" +
                "\ti: 1\n" +
                "\tidea: 1\n" +
                "\tless: 1\n" +
                "\tlighted: 1\n" +
                "\tmore: 1\n" +
                "\tneed: 1\n" +
                "\tnot: 1\n" +
                "\todds: 1\n" +
                "\told: 1\n" +
                "\tor: 1\n" +
                "\tother: 1\n" +
                "\tpieces: 1\n" +
                "\tpiles: 1\n" +
                "\tpleasant: 1\n" +
                "\troof: 1\n" +
                "\troom: 1\n" +
                "\trows: 1\n" +
                "\tso: 1\n" +
                "\tsort: 1\n" +
                "\tstairs: 1\n" +
                "\tthree: 1\n" +
                "\tto: 1\n" +
                "\ttrunks: 1\n" +
                "\tunder: 1\n" +
                "\tvalue: 1\n" +
                "\twalls: 1\n" +
                "\twarm: 1\n" +
                "\twell: 1\n" +
                "\twellregulated: 1\n" +
                "\twere: 1\n" +
                "\twinding: 1\n" +
                "\twindows: 1\n" +
                "\twith: 1\n";
        String actual = wc.display();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void descendingSortByValue() {
        WC wc = new WC("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/TestCaseStory1.txt");
        Map<String, Integer> map = new HashMap<>();

        wc.incrementValue(map, "summer");
        wc.incrementValue(map, "summer");
        wc.incrementValue(map, "summer");

        String expected = "{summer=3}";
        String actual = wc.descendingSortByValue(map).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementValue1(){
        WC wc = new WC("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/TestCaseStory1.txt");
        Map<String, Integer> map = new HashMap<>();

        wc.incrementValue(map, "summer");
        wc.incrementValue(map, "summer");
        wc.incrementValue(map, "summer");


        Integer expected = 3;


    }
    @Test
    public void display(){
        WC wc = new WC("/Users/bolee/Dev/Week_6/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/TestCase.txt");
        wc.wordCount();
        String expected = "Word Count in descending order:\n" +
                "\tsally: 2\n" +
                "\tice: 1\n" +
                "\tsells: 1\n";
        String actual = wc.display();

        Assert.assertEquals(expected,actual);
    }


}