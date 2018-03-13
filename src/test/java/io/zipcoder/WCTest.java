package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class WCTest {
     WC testWC = new WC( WC.class.getResource("/testFile.txt").getFile());
    @Test
    public void checkIfPrints(){
        String expected = "Total Words: appears 11 times\n" + "lab: appears 2 times\n" + "the: appears 2 times\n" + "done: appears 1 times\n"  +
                "getting: appears 1 times\n" + "help: appears 1 times\n" + "interesting: appears 1 times\n"
                + "is: appears 1 times\n" + "me: appears 1 times\n" + "will: appears 1 times\n";
        String actual = testWC.printMap();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SanctuaryTest(){
        WC bookWC = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        System.out.println(bookWC.printMap());
    }
}