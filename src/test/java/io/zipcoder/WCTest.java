package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WCTest {

    @Test
    public void wordCollectorTest() {

        WC wcTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        Map<String, Integer> expected = new LinkedHashMap<String, Integer>();
        expected.put("sunday", 3);
        expected.put("kids", 1);
        expected.put("seats", 1);
        expected.put("are", 1);
        expected.put("still", 1);
        expected.put("just", 1);
        expected.put("five", 1);
        expected.put("bucks", 1);

        Map<String, Integer> actual = wcTest.wordCollector();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCollectorTestSort() {

        WC wcTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        Map<String, Integer> expected = new LinkedHashMap<String, Integer>();
        expected.put("sunday", 3);
        expected.put("are", 1);
        expected.put("bucks", 1);
        expected.put("five", 1);
        expected.put("kids", 1);
        expected.put("just", 1);
        expected.put("seats", 1);
        expected.put("still", 1);

        Map<String, Integer> actual = wcTest.sortWordCollector();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void wordCollectorPrintTest() {
        WC wcTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        String expected = "         sunday : Occurred          3 times!\n" +
                "           kids : Occurred          1 times!\n" +
                "          seats : Occurred          1 times!\n" +
                "            are : Occurred          1 times!\n" +
                "          still : Occurred          1 times!\n" +
                "           just : Occurred          1 times!\n" +
                "           five : Occurred          1 times!\n" +
                "          bucks : Occurred          1 times!\n";
        Assert.assertEquals(expected, wcTest.printSortedMap());
    }



}