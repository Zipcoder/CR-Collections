package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenCheckerFalseTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "(hello";

        //Then
        boolean actual = parenTest.parenCheck(hi);

        Assert.assertFalse(actual);

    }

    @Test
    public void parenCheckerTrueTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "(hello)";

        //Then
        boolean actual = parenTest.parenCheck(hi);

        Assert.assertTrue(actual);

    }

    @Test
    public void falseBracketTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "[hello";

        //Then
        boolean actual = parenTest.openingHasClosing(hi);

        Assert.assertFalse(actual);

    }
    @Test
    public void trueBracketTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "[he'l'lo]";

        //Then
        boolean actual = parenTest.openingHasClosing(hi);

        Assert.assertTrue(actual);

    }

    @Test
    public void trueCurlyBracesTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "{hello} [World]";

        //Then
        boolean actual = parenTest.openingHasClosing(hi);

        Assert.assertTrue(actual);

    }
    @Test
    public void falseCurlyBracesTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String hi = "{hello>";

        //Then
        boolean actual = parenTest.openingHasClosing(hi);

        Assert.assertFalse(actual);

    }

}