package io.zipcoder;

import org.junit.Test;

public class WCTest {

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
}