package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class WCTest {

    @Test
    public void testWordCounter() {

        WC testWC = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        String expected = "{26=1, a=1, am=2, hello=1, i=2, is=1, keith=1, my=1, name=1, person=1}";
        String actual = testWC.wordCountStorage().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWordCounterTwo() {

        WC testWC = new WC(WC.class.getResource("/robertFrost.txt").getFile());
        String expected = "{two=2, roads=2, diverged=2, in=4, a=3, yellow=1, wood=2, and=9, sorry=1, i=9, could=2, not=1, travel=1, both=2, be=2, one=3, traveler=1, long=1, stood=1, looked=1, down=1, as=5, far=1, to=2, where=1, it=2, bent=1, the=8, undergrowth=1, then=1, took=2, other=1, just=1, fair=1, having=1, perhaps=1, better=1, claim=1, because=1, was=1, grassy=1, wanted=1, wear=1, though=1, for=2, that=3, passing=1, there=1, had=2, worn=1, them=1, really=1, about=1, same=1, morning=1, equally=1, lay=1, leaves=1, no=1, step=1, trodden=1, black=1, oh=1, kept=1, first=1, another=1, day=1, yet=1, knowing=1, how=1, way=2, leads=1, on=1, doubted=1, if=1, should=1, ever=1, come=1, back=1, shall=1, telling=1, this=1, with=1, sigh=1, somewhere=1, ages=2, hence=1, less=1, traveled=1, by=1, has=1, made=1, all=1, difference=1}";

        String actual = testWC.wordCountStorage().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortedWordCount(){
        WC testWC = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        String expected = "{i=2, am=2, hello=1, my=1, name=1, is=1, keith=1, a=1, person=1, 26=1}";
        String actual = testWC.sortInDescOrderByValue().toString();

        Assert.assertEquals(expected, actual);

    }

}
