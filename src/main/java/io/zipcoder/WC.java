package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class WC {
    private Iterator<String> stringIterator;
    private TreeMap<String, Integer> map;

    public WC(String fileName) {
        try {
            this.stringIterator = new Scanner(new FileReader(fileName));
            this.map = new TreeMap<String, Integer>();
            //parsing file in constructor, already has scanner for the file, might as well parse as
            // soon as recieve, not sure if best practice
            this.parse();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    //never used
//    public WC(Iterator<String> stringIterator) {
//        this.stringIterator = stringIterator;
//        this.map = new TreeMap<String, Integer>();
//        this.parse();
//    }

    private void parse() {
        while (this.stringIterator.hasNext()) {
            String s = this.stringIterator.next().toLowerCase().replaceAll("[^\\w]", "");
            Integer count = this.map.getOrDefault(s, 0);
            this.map.put(s, count+1);
        }
    }

    public void print() {
        this.map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        WC wc = new WC("/Users/kaitrinahigh/Downloads/47366-0.txt");
        wc.print();
    }
}








