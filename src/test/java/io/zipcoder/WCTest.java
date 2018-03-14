package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WCTest {
    @Test
    public void testReadFile(){
        WC test = new WC("src/main/resources/someTextFile.txt");
        Map<String,Integer> expected = new HashMap<String,Integer>();
        expected.put("Vince",1);
        expected.put("kibret",4);
        expected.put("joshua",2);
        expected.put("joe",2);
        expected.put("gio",1);
        expected.put("eric",1);

        Map<String,Integer>actual = test.readWords();
        Assert.assertEquals(expected,actual);

    }
@Test
    public void testPrintWords(){
    WC test = new WC("src/main/resources/someTextFile.txt");
    String expected ="Words          Count\n"+
                     "vince              1\n"+
                    "kibret              4\n"+
                    "joshua              2\n"+
                       "joe              2\n"+
                       "gio              1\n"+
                      "erik              1\n";


    String actual = test.printWords();

    Assert.assertEquals(expected,actual);
}

}