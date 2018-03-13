package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {

    @Test
    public void createMapTest(){
        //Given
        WC wordCount = new WC(WC.class.getResource("/244-0.txt").getFile());
        //When
        wordCount.createMap();
        //Then
        wordCount.printSubString(15);


    }

    @Test
    public void printMapTest(){
        //Given

        //When

        //Then

    }

}