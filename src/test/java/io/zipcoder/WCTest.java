package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

import static io.zipcoder.ParenChecker.openingAndClosing;

public class WCTest {


    @Test
    public void wordCountTest1() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());

        //When
        String expected = "{at=1, car=2, day=1, he=1, say=1, the=1}";
        String actual = wordCountTest.storeWordsAndCount().toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCountTest2() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile2.txt").getFile());

        //When
        String expected = "{at=1, car=2, day=1, he=1, say=1, the=1}";
        String actual = wordCountTest.storeWordsAndCount().toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortedByValue1() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile2.txt").getFile());

        //When
        String expected = "{car=2, at=1, day=1, he=1, say=1, the=1}";
        String actual = wordCountTest.sortedByValueDescending(wordCountTest.storeWordsAndCount()).toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortedByValue2() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile3.txt").getFile());

        //When
        String expected = "{the=28, and=12, was=10, to=9, a=6, at=6, of=6, in=5, it=5, watch=5, apples=4, but=4, he=4, king=4, son=4, all=3, bird=3, feather=3, gardener=3, golden=3, morning=3, one=3, that=3, then=3, tree=3, about=2, another=2, arrow=2, as=2, asleep=2, fell=2, garden=2, gone=2, harm=2, him=2, its=2, keep=2, night=2, no=2, ordered=2, twelve=2, under=2, agreed=1, air=1, always=1, an=1, angry=1, apple=1, away=1, beak=1, beautiful=1, became=1, began=1, bore=1, brought=1, called=1, came=1, certain=1, clock=1, come=1, consented=1, council=1, counted=1, did=1, dropped=1, eldest=1, every=1, everyone=1, fear=1, first=1, flew=1, flying=1, for=1, found=1, from=1, gardeners=1, gold=1, grow=1, had=1, have=1, heard=1, himself=1, his=1, however=1, i=1, is=1, jumped=1, kingdom=1, laid=1, last=1, let=1, man=1, me=1, midnight=1, missing=1, more=1, must=1, noise=1, not=1, oclock=1, offered=1, only=1, pure=1, ripe=1, rustling=1, said=1, second=1, set=1, shot=1, should=1, snapping=1, some=1, stood=1, struck=1, tail=1, than=1, them=1, these=1, they=1, third=1, this=1, time=1, together=1, too=1, up=1, use=1, very=1, wealth=1, were=1, when=1, which=1, whole=1, with=1, worth=1, would=1, young=1}";
        String actual = wordCountTest.sortedByValueDescending(wordCountTest.storeWordsAndCount()).toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayTest1() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile.txt").getFile());

        //When
        String expected = "\t2 : car\n" + "\t1 : at\n" + "\t1 : day\n" + "\t1 : he\n" + "\t1 : say\n" + "\t1 : the\n";
        String actual = wordCountTest.toDisplay(wordCountTest.sortedByValueDescending(wordCountTest.storeWordsAndCount()));

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void displayTest2() {
        //Given
        WC wordCountTest = new WC(WC.class.getResource("/someTextFile2.txt").getFile());

        //When
        String expected = "\t2 : car\n" + "\t1 : at\n" + "\t1 : day\n" + "\t1 : he\n" + "\t1 : say\n" + "\t1 : the\n";
        String actual = wordCountTest.toDisplay(wordCountTest.sortedByValueDescending(wordCountTest.storeWordsAndCount()));

        //Then
        Assert.assertEquals(expected, actual);
    }
}