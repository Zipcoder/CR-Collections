package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;

public class WCTest {

    @Test
    public void operationTest1() {
        WC wc = new WC(WC.class.getResource("/theBook.txt").getFile());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        wc.program();
        Assert.assertNotNull(outputStream);
    }

    @Test
    public void operationTest2() {
        WC wc = new WC(WC.class.getResource("/documentationDef.txt").getFile());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        wc.program();
        String expected = "Word: use                   |  Occurrences: 1\n" +
                "Word: to                    |  Occurrences: 2\n" +
                "Word: the                   |  Occurrences: 3\n" +
                "Word: substantiation;       |  Occurrences: 1\n" +
                "Word: referring             |  Occurrences: 1\n" +
                "Word: provision             |  Occurrences: 2\n" +
                "Word: or                    |  Occurrences: 3\n" +
                "Word: of                    |  Occurrences: 3\n" +
                "Word: objective             |  Occurrences: 1\n" +
                "Word: in                    |  Occurrences: 1\n" +
                "Word: historical            |  Occurrences: 2\n" +
                "Word: footnotes,            |  Occurrences: 1\n" +
                "Word: facts                 |  Occurrences: 1\n" +
                "Word: evidence              |  Occurrences: 2\n" +
                "Word: documents             |  Occurrences: 2\n" +
                "Word: documentary           |  Occurrences: 2\n" +
                "Word: containing            |  Occurrences: 1\n" +
                "Word: conformity            |  Occurrences: 1\n" +
                "Word: b                     |  Occurrences: 1\n" +
                "Word: appendices,           |  Occurrences: 1\n" +
                "Word: also                  |  Occurrences: 1\n" +
                "Word: addenda               |  Occurrences: 1\n" +
                "Word: a                     |  Occurrences: 1\n" +
                "Word: :                     |  Occurrences: 5\n";
        Assert.assertEquals(outputStream.toString(), expected);
    }

    @Test
    public void getOccTest(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("Hello");
        words.add("Hello");
        words.add("Yo");
        words.add("hahahahahaa");
        WC wc = new WC();
        Assert.assertEquals(3, wc.getOccurrences("Hello", words));
    }

    @Test
    public void fillTreeMapTest(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("Hello");
        words.add("Hello");
        words.add("Yo");
        words.add("hahahahahaa");
        WC wc = new WC(words.iterator());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        wc.program();
        String expected = "Word: hahahahahaa           |  Occurrences: 1\n" +
                "Word: Yo                    |  Occurrences: 1\n" +
                "Word: Hello                 |  Occurrences: 3\n";
       Assert.assertEquals(expected, outputStream.toString());
    }
}