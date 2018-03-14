package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WCTest {

    // Bask in glory
    @Test
    public void printWC() {
        WC wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        wc.logic();
        Assert.assertEquals("here 1\n" +
                "but 1\n" +
                "some 1\n" +
                "be 1\n" +
                "do 2\n" +
                "lab 1\n" +
                "repeated 1\n" +
                "that 1\n" +
                "not 1\n" +
                "are 1\n" +
                "of 1\n" +
                "now 1\n" +
                "text 1\n" +
                "will 1\n" +
                "one 1\n" +
                "words 1\n" +
                "this 2\n" +
                "was 1\n" +
                "i 1\n" +
                "is 2\n" +
                "them 1\n" +
                "what 1\n" +
                "there 1\n" +
                "know 1\n" +
                "to 1\n" +
                "fun 1\n", outputStream.toString());
    }

}