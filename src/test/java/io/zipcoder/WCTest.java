package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class WCTest {

    WC myTester;

    @Before
    public void setup(){
        myTester = new WC(WC.class.getResource("/someTextFile.txt").getFile());
    }



    @Test
    public void testWC(){
        myTester.splitter();
    }



}