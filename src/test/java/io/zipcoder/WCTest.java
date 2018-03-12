package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class WCTest {

    LinkedHashMap<String,Integer> testOutput;

    @Before
    public void setUp(){
        testOutput = new LinkedHashMap<>();
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
        ArrayList <Map.Entry<String,Integer>> expected = new ArrayList<>(testOutput.entrySet());
        ArrayList <Map.Entry<String,Integer>> actual = testCounter.countWords();

        //Then
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(expected,actual);

    }



}