package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {
@Test
    public void testPrintWords(){
    WC test = new WC("src/main/resources/someTextFile.txt");
    test.printWords();
}

}