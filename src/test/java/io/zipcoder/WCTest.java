package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    File file = new File("../resources/someTextFile.txt");
    WC wc;

    @Before
    public void setup(){
        wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
    }

    @Test
    public void duckDuckGooseTest(){
        wc.wordCount();
    }

}