package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void testParenPairTrue() {
        //Given
        ParenChecker parenTest = new ParenChecker();
        String string1 = "I can't fight (this feeling anymore).";
        //When

        //Then
        Assert.assertTrue(parenTest.parenPair(string1));
    }

    @Test
    public void testParenPairFalse() {
        //Given
        ParenChecker parenTest = new ParenChecker();
        String string2 = "I've (forgotten) what I( started (fighting for).";
        //When

        //Then
        Assert.assertFalse(parenTest.parenPair(string2));
    }

    @Test
    public void testForEachOpeningAClosingTrue() {
        // Given
        ParenChecker parenTest = new ParenChecker();
        String string2 = "I have 'no' <insert quote here> never spotted a [dougie] so fresh \"To death\" that even a map.";

        Assert.assertTrue(parenTest.forEachOpeningAClosing(string2));
    }

    @Test
    public void testForEachOpeningAClosingFalse() {
        // Given
        ParenChecker parenTest = new ParenChecker();
        String string2 = "I <pop>  ('ksd that'll do) ,<<";
        Assert.assertFalse(parenTest.forEachOpeningAClosing(string2));
    }


}