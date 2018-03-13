package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    @Test
    public void testShort(){
        WC test = new WC(WC.class.getResource("/superShort.txt").getFile());
        test.textIterator();
        test.sorted();
        test.print();

    }
    @Test
    public void testMedium(){
        WC test = new WC(WC.class.getResource("/jabberwocky.txt").getFile());
        test.textIterator();
        test.sorted();
    }
    @Test
    public void testLong(){
        WC test = new WC(WC.class.getResource("/NineteenEightyFour.txt").getFile());
        test.textIterator();
        test.sorted();

    }
}