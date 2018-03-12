package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    // What am I testing
    @Test
    public void printWC() {
        WC wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        wc.logic();
    }

}