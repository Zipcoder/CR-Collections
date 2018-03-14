package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest
{
    @Test
    public void parenPairTest1()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "()()";
        Assert.assertTrue(parenChecker.parenPair(input));
    }

    @Test
    public void parenPairTest2()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "()()(";
        Assert.assertFalse(parenChecker.parenPair(input));
    }

    @Test
    public void anyPairTest1()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "()<>";
        Assert.assertTrue(parenChecker.anyPair(input));
    }

    @Test
    public void anyPairTest2()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "()[{]}<";
        Assert.assertFalse(parenChecker.anyPair(input));
    }

    @Test
    public void containsPairTest1()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "{}";
        Assert.assertTrue(parenChecker.containsPair(input, '{', '}'));

    }

    @Test
    public void containsPairTest2()
    {
        ParenChecker parenChecker = new ParenChecker();
        String input = "<>";
        Assert.assertTrue(parenChecker.containsPair(input, '<', '>'));
    }

}