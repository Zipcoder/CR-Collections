package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenCheckerTest {
    ParenChecker parenChecker;

    @Before
    public void setup(){
        parenChecker = new ParenChecker("er(gerg)werwerew");
    }

    @Test
    public void checkParenTest(){
        Assert.assertTrue(parenChecker.checkParen());
    }

    @Test
    public void checkParenTest2(){
        parenChecker = new ParenChecker("wuiebfuiewb((alhwbef)");
        Assert.assertFalse(parenChecker.checkParen());
    }

    @Test
    public void checkParenTest3(){
        parenChecker = new ParenChecker("wuiebfuiew)b((alhwbef)");
        Assert.assertFalse(parenChecker.checkParen());
    }

    @Test
    public void checkParenTest4(){
        parenChecker = new ParenChecker("wuiebfui(ew)b((alhwbef)");
        Assert.assertFalse(parenChecker.checkParen());
    }

}