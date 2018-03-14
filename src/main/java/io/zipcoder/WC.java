package io.zipcoder;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
@TODO
*@1.)Create a parenthesis verifier method, that  can (check if all parenthesis are ('paired')
* @2.)Create a method that checks all opening characters have a closing one
* - These Characters () {} [] <> "" ''
* This program should be able to:
 * 1 - count all the words in a file
 * 2 - Print out all the words
 * 3 - Print the word counts in descending order
 */

public class WC {
    private Iterator<String> si;

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName)).useDelimiter("[^a-zA-Z]+");
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public Map<String, Integer> countWords() {
        Map<String, Integer> expectedCount = new HashMap<>();
        si.next()
    }
}