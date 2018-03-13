package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WCTest {

    @Test
    public void sortByValue(){
        WC wcTest = new WC(WC.class.getResource("/testFile.txt").getFile());

        wcTest.wordCollector();

        String expected = "4 : love\n" +
                "3 : i\n" +
                "3 : cheese\n" +
                "1 : of\n" +
                "1 : cheese's\n" +
                "1 : type\n" +
                "1 : every\n" +
                "1 : apples\n";
        String actual = wcTest.printMap(wcTest.sortByCount());
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countWordTest(){
        WC wcTest = new WC(WC.class.getResource("/testFile.txt").getFile());

        wcTest.wordCollector();

        int expected = 15;
        int actual = wcTest.countWord();

        Assert.assertEquals(expected, actual);
    }

}