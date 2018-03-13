package io.zipcoder;

import apple.laf.JRSUIUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WCTest {

//    @Test
//    public void wcWPTest() {
//        //Given
//        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/WarPeace.txt");
//
//        //When
//        int expected = 566206;
//        int actual = wordCountTest.wordCount();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void wcTxtTest() {
//        //Given
//        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/text.txt");
//
//        //When
//        int expected = 18;
//        int actual = wordCountTest.wordCount();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void wcHelloTest() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/hello.txt");

        //When
        int expected = 8;
        int actual = wordCountTest.wordCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uniqueWordTest() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/text.txt");
        Map<String, Integer> expected = new TreeMap<>();

        //When
        expected.put("the", 4);
        expected.put("quick", 2);
        expected.put("purple", 2);
        expected.put("fox", 3);
        expected.put("jumped", 1);
        expected.put("over", 1);
        expected.put("lazy", 1);
        expected.put("dog", 1);
        expected.put("excited", 1);
        expected.put("under", 1);
        expected.put("danced", 1);

        //Then
        Map<String, Integer> actual = wordCountTest.uniqueWordCount();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void uniqueWordTest1() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/hello.txt");
        Map<String, Integer> expected = new TreeMap<>();

        //When
        expected.put("hello", 7);
        expected.put("bye", 1);

        //Then
        Map<String, Integer> actual = wordCountTest.uniqueWordCount();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void returnValueDescPrintTest() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/hello.txt");

        //When
        String expected = "Word: Count For Entire File\n" +
                "Appears: 8 times \n" +
                "_____________\n" +
                "Word: hello\n" +
                "Appears: 7 times \n" +
                "_____________\n" +
                "Word: bye\n" +
                "Appears: 1 times \n" +
                "_____________\n";

        //Then
        String actual = wordCountTest.printMap();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void returnValueDescPrintTest2() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/text.txt");

        //When
        String expected = "Word: Count For Entire File\n" +
                "Appears: 18 times \n" +
                "_____________\n" +
                "Word: the\n" +
                "Appears: 4 times \n" +
                "_____________\n" +
                "Word: fox\n" +
                "Appears: 3 times \n" +
                "_____________\n" +
                "Word: quick\n" +
                "Appears: 2 times \n" +
                "_____________\n" +
                "Word: purple\n" +
                "Appears: 2 times \n" +
                "_____________\n" +
                "Word: jumped\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: over\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: lazy\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: dog\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: danced\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: under\n" +
                "Appears: 1 times \n" +
                "_____________\n" +
                "Word: excited\n" +
                "Appears: 1 times \n" +
                "_____________\n";

        //Then
        String actual = wordCountTest.printMap();
        Assert.assertEquals(expected, actual);
    }
}



