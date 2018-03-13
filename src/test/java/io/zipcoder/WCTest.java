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
        testOutput.put("TOTAL WORDS",11);
        testOutput.put("birb",3);
        testOutput.put("stinky",2);
        testOutput.put("bird",1);
        testOutput.put("eat",1);
        testOutput.put("go",1);
        testOutput.put("henlo",1);
        testOutput.put("seed",1);
        testOutput.put("some",1);

    }

    @Test
    public void countWordsTest(){
        //Given
        WC testCounter = new WC(WC.class.getResource("/testFile.txt").getFile());

        //When
        ArrayList <Map.Entry<String,Integer>> expected = new ArrayList<>(testOutput.entrySet());
        LinkedList <Map.Entry<String,Integer>> actual = testCounter.countWordsWithLinking();

        //Then
        Assert.assertEquals(expected,actual);

    }



}