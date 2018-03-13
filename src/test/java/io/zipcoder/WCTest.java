package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class WCTest {

    // Bask in glory
    @Test
    public void printWC() {
        WC wc = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        wc.logic();
    }

}