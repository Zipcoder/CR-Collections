package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    File file = new File("../resources/someTextFile.txt");
    WC wc;

    @Before
    public void setup(){
        wc = new WC("/Users/patrickglavin/Dev/third_hex/EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        wc = new WC("/../../../resources/someTextFile.txt");
    }

    @Test
    public void constructorTest(){

    }

    // /Users/patrickglavin/Dev/third_hex/EncapsulativeCharacters/src/main/java/io/zipcoder/WC.java


    // /Users/patrickglavin/Dev/third_hex/EncapsulativeCharacters/src/main/java/io/zipcoder/WC.java
    // /Users/patrickglavin/Dev/third_hex/EncapsulativeCharacters/src/main/resources/someTextFile.txt
}