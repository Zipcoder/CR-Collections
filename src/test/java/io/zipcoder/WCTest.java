package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WCTest {

//  Map<String, Integer> reader = new LinkedHashMap<>();
//    reader.put("luke",5);
//    reader.put("funny",2);
//    reader.put("smart",3);
//    reader.put("and",2);
//    reader.put("i",1);
//    reader.put("is",1);
//    reader.put("love",1);


  @Test
  public void wordCollectorTest() {

    WC wc = new WC(WC.class.getResource("/testFile.txt").getFile());
    String expected = "Total Words: appears 15 times\nluke: appears 5 times\nsmart: appears 3 times\nfunny: appears 2 times\n" +
            "and: appears 2 times\ni: appears 1 times\nlove: appears 1 times\nis: appears 1 times\n";


    String actual = wc.printMap();
    System.out.println(actual);
    Assert.assertEquals(expected, actual);
  }


}