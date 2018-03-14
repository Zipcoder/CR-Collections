package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {


    public ParenCheckerTest() {
    }

    @Test
    public void testParenCheck() {
        //given
        ParenChecker parenChecker = new ParenChecker();
        //when
        String input = "ab(c)d(";
        //then
        boolean actual = parenChecker.parenCheck(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void testIsPair() {
        //given
        ParenChecker parenChecker = new ParenChecker();
        //when
        String input = "(xoxo)";
        //then
        boolean actual = parenChecker.parenCheck(input);
        Assert.assertTrue(actual);
    }
    @Test
    public void testIsPair1() {
        //given
        ParenChecker parenChecker = new ParenChecker();
        //when
        String input = "<sdkls<e>sdokf>";
        //then
        boolean actual = parenChecker.parenCheck(input);
        Assert.assertFalse(actual);
    }
}

