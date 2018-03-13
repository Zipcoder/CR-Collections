package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WCTest {

//    @Test
//    public void wordCounterTestString() {
//        String passage = " And here on thy seventh day of our lord and saviour, we are compelled to resteth on" +
//                " our laurels.";
//
//        WC wcTest = new WC(passage);
//        int expected = 1;
//        int actual = wcTest.wordCollector();
//        Assert.assertEquals(expected, actual);
//    }
    @Test
    public void testWordCOllector() {

    }

    @Test
    public void wordCollectorTest() {

        WC wcTest = new WC(WC.class.getResource("someTextFile.txt").getFile());
        Map<String, Integer> testWC = new HashMap<String, Integer>();
        int expected = 0;
        int actual = testWC.get("Monday");
        Assert.assertEquals(expected, actual);
    }
}