package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class WCTest {

    HashMap<String,Integer> testOutput;

    @Before
    public void setUp(){
        testOutput = new HashMap<>();
        testOutput.put("birb",3);
        testOutput.put("stinky",2);
        testOutput.put("henlo",1);
        testOutput.put("go",1);
        testOutput.put("eat",1);
        testOutput.put("some",1);
        testOutput.put("bird",1);
        testOutput.put("seed",1);
    }

    @Test
    public void countWordsTest(){
        //Given
        WC testCounter = new WC(WC.class.getResource("/testFile.txt").getFile());

        //When
        HashMap<String,Integer> expected = testOutput;
        HashMap<String,Integer> actual = testCounter.countWords();

        //Then
        Assert.assertEquals(expected,actual);

    }



}