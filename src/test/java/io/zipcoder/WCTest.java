package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    @Test
    public void wcTest() {
        //Given
        WC wordCountTest = new WC("/Users/karoushafennimore/Dev/EncapsulativeCharacters/src/main/resources/hello.txt");

        //When
        int expected = 18;
        int actual = wordCountTest.wordCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}