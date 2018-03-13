package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WCTest {

    File file = new File("../resources/someTextFile.txt");
    WC wc;

    @Before
    public void setup(){
        wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
    }

    @Test
    public void duckDuckGooseTest(){
        wc = new WC(WC.class.getResource("/duckduckgoose.txt").getFile());
        ArrayList<String> expected = new ArrayList<>();
        expected.add("duck");
        expected.add("duck");
        expected.add("goose");
        Assert.assertEquals(expected, wc.removePunctuation());
    }

    @Test
    public void duckDuckGooseWordCount(){
        wc = new WC(WC.class.getResource("/duckduckgoose.txt").getFile());
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("duck", 2);
        expected.put("goose", 1);
        Assert.assertEquals(expected, wc.wordCount());
    }

    @Test
    public void duckDuckGooseWordCount2(){
        wc = new WC(WC.class.getResource("/duckduck2.txt").getFile());
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("duck", 4);
        expected.put("heron", 3);
        expected.put("chicken", 2);
        expected.put("goose", 1);
        Assert.assertEquals(expected, wc.wordCount());
    }

    @Test
    public void frankensteinTest(){
        wc = new WC(WC.class.getResource("/frankenstein.txt").getFile());
        System.out.println(wc.wordCount());
    }

}