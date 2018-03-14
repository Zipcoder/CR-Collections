package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class WC {
    private Iterator<String> si;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }
}

/*
WC

Write a program that counts all of the words in a file and
prints out all of the words and their counts in descending order.

You can put an text file in resources and get that string's filename from

WC.class.getResource("/filename").getFile()

I would suggest grabbing a book from gutenberg.org and use that as a testing set.

Also, there is a String iterator constructor so
that you can also write some tests using some data built within the tests.
 */