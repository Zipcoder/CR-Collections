package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest
{
    @Test
    public void generateHashMapTest1()
    {
        WC test = new WC(WC.class.getResource("/someTextFile.txt").getFile());

        test.generateLinkedHashMap();
        test.printLinkedHashMap();

        System.out.println(test.printLinkedHashMap());
    }

    @Test
    public void generateHashMapTest2()
    {
        WC test = new WC(WC.class.getResource("/56734-0.txt").getFile());

        test.generateLinkedHashMap();
        test.printLinkedHashMap();

        System.out.println(test.printLinkedHashMap());
    }


}