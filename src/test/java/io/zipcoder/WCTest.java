package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {
    ArrayList<String> stringList = new ArrayList<String>();

    @Before
    public void setUp(){
        stringList.add("test");
        stringList.add("apple");
        stringList.add("test");
        stringList.add("case");
        stringList.add("case");
        stringList.add("case");
    }

    @Test
    public void wordCheckerTest1(){
        WC wcTest = new WC(stringList.iterator());
        wcTest.wordCounter();
        int actual = wcTest.getWordMap().get("apple");
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void wordCheckerTest2(){
        WC wcTest = new WC(stringList.iterator());
        wcTest.wordCounter();
        int actual = wcTest.getWordMap().get("case");
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void wordCheckerTest3(){
        ArrayList<String> testArray2 = new ArrayList<String>();
        testArray2.add("apple test test case case case");
        WC wcTest = new WC(testArray2.iterator());
        wcTest.wordCounter();
        int actual = wcTest.getWordMap().get("case");
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void wordCheckerTest4(){
        WC wcTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        wcTest.wordCounter();
        int actual = wcTest.getWordMap().get("test");
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }
}
