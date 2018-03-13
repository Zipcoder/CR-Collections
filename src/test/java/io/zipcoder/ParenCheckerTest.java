package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenCheckerTest {

    ParenChecker parenChecker;

    @Before
    public void setup() {
        parenChecker = new ParenChecker();
    }

    @Test
    public void arePairedParenthesisTest1() {
        String tester = "((";
        Assert.assertFalse(parenChecker.arePaired(tester));
    }

    @Test
    public void arePairedParenthesisTest2() {
        String tester = "()()()";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }
    @Test
    public void arePairedParenthesisTest3() {
        String tester = "a(d)d(d)d(d)d";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }

    @Test
    public void areSquiglyBracesPairedTest1() {
        String tester = "{{";
        Assert.assertFalse(parenChecker.arePaired(tester));
    }

    @Test
    public void areSquiglyBracesPairedTest2() {
        String tester = "{}{}{}";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }

    @Test
    public void areSquiglyBraacesPairedTest3() {
        String tester = "A{}{}{}{A}";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }

    @Test
    public void arePair() {
        String tester = "(A){A}<A>\"A\"[A}";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }

    @Test
    public void areQuotesPairedTest() {
        String tester = "\"\"";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }

    @Test
    public void areQuotesPairedTest2() {
        String tester = "(\"\")";
        Assert.assertTrue(parenChecker.arePaired(tester));
    }
}