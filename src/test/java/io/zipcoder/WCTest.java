package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WCTest {

    @Test
    public void testShort(){
        WC test = new WC(WC.class.getResource("/superShort.txt").getFile());
        test.textIterator();
        String expected = test.toString();
        String actual = "to : 3\n" +
                "dogs : 2\n" +
                "dog : 2\n" +
                "food : 2\n" +
                "because : 2\n" +
                "it : 2\n" +
                "is : 2\n" +
                "4 : 2\n" +
                "love : 1\n" +
                "eat : 1\n" +
                "not : 1\n" +
                "they : 1\n" +
                "are : 1\n" +
                "but : 1\n" +
                "eye : 1\n" +
                "cannot : 1\n" +
                "believe : 1\n" +
                "how : 1\n" +
                "easy : 1\n" +
                "go : 1\n" +
                "wendy : 1\n" +
                "s : 1\n" +
                "and : 1\n" +
                "get : 1\n" +
                "a : 1\n" +
                "for : 1\n";
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void testMedium(){
        WC test = new WC(WC.class.getResource("/jabberwocky.txt").getFile());
        test.textIterator();
        test.toString();
    }
    @Test
    public void testLong(){
        WC test = new WC(WC.class.getResource("/NineteenEightyFour.txt").getFile());
        test.textIterator();
        test.toString();

    }
}