package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WCTest {
    private WC counter;

    @Before
    public void setup() {
        String input = "The first line\nThe second line\n The third line\nFourth line is best line";
        List<String> words = new ArrayList<>(Arrays.asList(input.split("[^\\w]+")));
        counter = new WC(words.iterator());
    }

    @Test
    public void testSmallInput() {
        String name = "src/resources/small.txt";
        WC wc = new WC(name);
        wc.generate();
        wc.print();
    }

    @Test
    public void testMediumInput() {
        WC wc = new WC("src/resources/frost.txt");
        wc.generate();
        wc.print();
    }

    @Test
    public void testLargeInput() {
        WC wc = new WC("src/resources/large.txt");
        wc.generate();
        wc.print();
    }

    @Test
    public void testWithIterator() {
        Integer expected = 3;
        counter.generate();

        Integer actual = counter.getCountForKey("the");

        Assert.assertEquals(expected, actual);
    }
}