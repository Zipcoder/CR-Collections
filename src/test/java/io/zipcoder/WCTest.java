package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class WCTest {

    @Test
    public void testCheckParenOne() {

        WC testWC = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        String expected = "{26=1, a=1, am=2, hello=1, i=2, is=1, keith=1, my=1, name=1, person=1}";
        String actual = testWC.wordCountStorage().toString();

        Assert.assertEquals(expected, actual);
    }

}


//    TreeMap<String, Integer> uniqueWordCount = new TreeMap<String, Integer>();
//        uniqueWordCount.get("a") = 1;
//                uniqueWordCount.get("am") = 2;
//                uniqueWordCount.get("hello") = 1;
//                uniqueWordCount.get("I") = 2;
//                uniqueWordCount.get("is") = 1;
//                uniqueWordCount.get("keith") = 1;
//                uniqueWordCount.get("my") = 1;
//                uniqueWordCount.get("person") = 1;
//                uniqueWordCount.get("26") = 1;