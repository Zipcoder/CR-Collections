package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.*;

import static java.math.BigInteger.valueOf;

public class WC {

    private Iterator<String> si;
    private LinkedHashMap<BigInteger, String> wordCount;
    private ArrayList stringList;


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

    public LinkedHashMap<BigInteger, String> createMap(){
        return null;
    }

    public String printMap(){
        return null;
    }

    public String printSubString(Integer numberOfMapEntries){
        return null;
    }

}

