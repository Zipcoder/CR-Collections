package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WCTest {
    WC test;
    WC test2;

    @Before
    public void setup() {
        test = new WC(WC.class.getResource("/testText.txt").getFile());
        test2 = new WC(WC.class.getResource("/textText2.txt").getFile());
    }

    @Test
    public void wordCountTest() {
        String expected = "hello : 2\nhi : 2\nmy : 1\nname : 1\nis : 1\nbrian : 1\n";
        String actual = test.printWordsAndCountInDescendingOrder();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void wordCountTest2() {
        String expected = "hi : 4\nhello : 2\n";
        String actual = test2.printWordsAndCountInDescendingOrder();

        Assert.assertEquals(expected, actual);
    }
}