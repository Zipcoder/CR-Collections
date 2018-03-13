package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void isPairedTest1() {
        ParenChecker parenChecker = new ParenChecker();
        String str = "()()()()";

        Assert.assertTrue(parenChecker.isPaired(str));
    }

    @Test
    public void isPairedTest2() {
        ParenChecker parenChecker = new ParenChecker();
        String str = ")()()()()((";

        Assert.assertFalse(parenChecker.isPaired(str));
    }

    @Test
    public void isPairedTest3() {
        ParenChecker parenChecker = new ParenChecker();
        String str = ")((()";

        Assert.assertFalse(parenChecker.isPaired(str));
    }

    @Test
    public void hasClosingTest1() {
        ParenChecker parenChecker = new ParenChecker();
        String str = "<<>>(){}[]";

        Assert.assertTrue(parenChecker.hasClosing(str));
    }

    @Test
    public void hasClosingClosingTest2() {
        ParenChecker parenChecker = new ParenChecker();
        String str = "\"\"";

        Assert.assertTrue(parenChecker.hasClosing(str));
    }

    @Test
    public void hasClosingClosingTest3() {
        ParenChecker parenChecker = new ParenChecker();
        String str = "\'\'\'";

        Assert.assertFalse(parenChecker.hasClosing(str));
    }

    @Test
    public void hasPairTest1() {
        ParenChecker parenChecker = new ParenChecker();
        String str = "()()()()";

        Assert.assertTrue(parenChecker.hasPair(str, '(', ')'));
    }


}