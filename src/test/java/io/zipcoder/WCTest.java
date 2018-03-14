package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {
    @Test
    public void count(){
        WC wc = new WC("/Users/katricewilliams-dredden/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        wc.count();
        String expected = "Count in descending order: \n" +

            "\ta: 9\n"+
            "\tall: 1\n" +
            "\tand: 3\n" +
            "\tand,: 1\n" +
            "\tapart: 1\n" +
            "\tascending: 1\n" +
            "\tbeen: 1\n" +
            "\tbeneath: 1\n" +
            "\tblack,: 1\n" +
            "\tblood,: 1\n" +
            "\tborn: 1\n" +
            "\tboy: 1\n" +
            "\tbrim.: 1\n" +
            "\tbrow.: 1\n" +
            "\tbut: 1\n" +
            "\tcoming: 1\n" +
            "\tconcealed: 1\n" +
            "\tcorrect: 1\n" +
            "\tcountry: 1\n" +
            "\tdark-complexioned,: 1\n" +
            "\tdialect,: 1\n" +
            "\tdid: 1\n" +
            "\tdistruct.: 1\n" +
            "\tdown: 1\n" +
            "\teastern: 1\n" +
            "\tenglish: 1\n" +
            "\texcited: 1\n" +
            "\teyes: 1\n" +
            "\tfirst: 1\n" +
            "\tfor: 1\n" +
            "\tforehead: 1\n" +
            "\tfrom: 3\n" +
            "\tgypsy: 2\n" +
            "\thad: 1\n" +
            "\that,: 1\n" +
            "\the: 7\n" +
            "\thim: 1\n" +
            "\thimself: 1\n" +
            "\this: 3\n" +
            "\timpression: 2\n" +
            "\tin: 2\n" +
            "\titself: 1\n" +
            "\tknew: 1\n" +
            "\tknow,: 1\n" +
            "\tknow;: 1\n" +
            "\tlife: 1\n" +
            "\tlook: 1\n" +
            "\tlooked: 1\n" +
            "\tlow,: 1\n" +
            "\tman: 2\n" +
            "\tmet: 1\n" +
            "\tnearly: 1\n" +
            "\tnew: 1\n" +
            "\tno: 2\n" +
            "\tnot: 1\n" +
            "\tof: 3\n" +
            "\tone: 1\n" +
            "\tother.: 1\n" +
            "\tout: 1\n" +
            "\tover: 1\n" +
            "\tpair: 1\n" +
            "\tperhaps: 1\n" +
            "\tpiercing: 1\n" +
            "\tproduced: 1\n" +
            "\treceding: 1\n" +
            "\tseemed: 1\n" +
            "\tsinister: 1\n" +
            "\tslouch: 1\n" +
            "\tspoke,: 1\n" +
            "\tsteep: 1\n"  +
            "\tstreet: 1\n" +
            "\ttall: 1\n" +
            "\tthat: 1\n" +
            "\tthe: 6\n" +
            "\tthose: 1\n" +
            "\tto: 1\n" +
            "\ttongue: 1\n" +
            "\ttown: 1\n" +
            "\ttramps: 1\n" +
            "\ttwo: 1\n" +
            "\tupon: 1\n" +
            "\tview: 1\n" +
            "\twanderer,: 1\n" +
            "\twas: 6\n" +
            "\twere: 1\n" +
            "\twhere: 1\n" +
            "\twhich: 2\n" +
            "\twhich,: 1\n" +
            "\twho: 1\n" +
            "\twith: 1\n" +
            "\twore: 1\n" +
            "\tyork: 1\n";


        String actual = wc.displayMap();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayMap(){
        WC wc = new WC("/Users/katricewilliams-dredden/Dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/testFile.txt");
        wc.count();
        String expected = "Count in descending order: \n" +
                "\tpolo: 1\n" +
                "\trolly: 1\n" +
                "\tyolo: 2\n";
        String actual = wc.displayMap();
        Assert.assertEquals(expected, actual);

    }

}