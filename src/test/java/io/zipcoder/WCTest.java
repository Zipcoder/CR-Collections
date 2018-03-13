package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WCTest {

    private WC wc;

    @Before
    public void setup(){
        wc = new WC(WC.class.getResource("/someOtherTextFile.txt").getFile());
        wc.getSi();
    }

    @Test
    public void splitFileTest(){
        //Given
        wc = new WC(WC.class.getResource("/someOtherTextFile.txt").getFile());
        ArrayList<String> expected = new ArrayList<>();
        expected.add("hiya");
        expected.add("this");
        expected.add("this");
        expected.add("is");
        expected.add("is");
        expected.add("a");
        expected.add("test");
        //When
        wc.splitFile();
        //Then
        Assert.assertEquals(expected, wc.words);

    }
    @Test
    public void wordCountTest(){
        //Given
        wc = new WC(WC.class.getResource("/someOtherTextFile.txt").getFile());
        ArrayList<String> expected1 = new ArrayList<>();
        expected1.add("hiya");
        expected1.add("this");
        expected1.add("this");
        expected1.add("is");
        expected1.add("is");
        expected1.add("a");
        expected1.add("test");

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hiya", 1);
        expected.put("this", 2);
        expected.put("is", 2);
        expected.put("a", 1);
        expected.put("test", 1);
        //When
        wc.splitFile();
        wc.wordCount();
        //Then
        Assert.assertEquals(expected, wc.wordMap);

    }
    @Test
    public void sortedMapTest(){
        //Given
        wc = new WC(WC.class.getResource("/someOtherTextFile.txt").getFile());
        ArrayList<String> expected1 = new ArrayList<>();
        expected1.add("hiya");
        expected1.add("this");
        expected1.add("this");
        expected1.add("is");
        expected1.add("is");
        expected1.add("a");
        expected1.add("test");

        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("hiya", 1);
        expected2.put("this", 2);
        expected2.put("is", 2);
        expected2.put("a", 1);
        expected2.put("test", 1);

        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("hiya", 1);
        expected.put("this", 2);
        expected.put("is", 2);
        expected.put("a", 1);
        expected.put("test", 1);

        //When
        wc.splitFile();
        wc.wordCount();
        wc.sortedMap();
        //Then
        Assert.assertEquals(expected, wc.sortedMap());
    }
}