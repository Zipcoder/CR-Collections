package io.zipcoder;

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
    private TreeMap<String, Integer> book;

    public WC(String fileName) {
        try { //As soon as the scanner recieves my book(map) it will get
            this.book = new TreeMap<>();
            this.si = new Scanner(new FileReader(fileName)).useDelimiter("[^a-zA-Z]+");
            this.metaCharRemover();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "Does Not Exist");
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        WC wordCounts = new WC(WC.class.getResource("/").getFile());
        wordCounts.descendAndPrintText();
    }

    public WC(Iterator<String> stringIterator) {
        this.si = stringIterator;
    }

    private void metaCharRemover() {
        while (si.hasNext()) { //while the iterator has the next line do this stuff below it
            String word = si.next().toLowerCase().replaceAll("[\"^${}().+&~!@#%*]", ""); //change all characters within file to lower case and replace all metacharacters with nothing so that only the words are counted when its time to count
            Integer wordCount = book.getOrDefault(word, 0); //set my default value for word count to 0
            book.put(word, (wordCount + 1)); //insert my word and word count into my value
        }
    }

    private void descendAndPrintText() { //stream is pulling out JUST my words in sequential order first before sorting them in descending order, reverse is so that the highest number will print first and get lower accordingly
        String newBook = "";
        newBook += book.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) + "\n";
        System.out.println(newBook);
    }
}