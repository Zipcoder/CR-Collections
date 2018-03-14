package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void testParenChecker1(){
        boolean actual = ParenChecker.parenChecker("(");
        Assert.assertFalse(actual);
    }

    @Test
    public void testPareChecker2(){
       boolean actual =  ParenChecker.parenChecker("ahfas(;fjjljl)hdhjfj777(kjjg)dfkj");
       Assert.assertTrue(actual);
    }

    @Test
    public void testPareChecker3(){
        boolean actual = ParenChecker.parenChecker("<hjadhfd>)haddhjk(jkl(lkdja)");
        Assert.assertFalse(actual);
    }
    @Test
    public void testParenChecker4(){
        boolean actual = ParenChecker.parenChecker("))))))))))ajhdfdha;(((9");
        Assert.assertFalse(actual);
    }
    @Test
    public void testParenChecker5(){
        boolean actual = ParenChecker.parenChecker("eyioewncnv(((hgajdhak)adnkjf)euei)");
        Assert.assertTrue(actual);
    }
    @Test
    public void testCheckMatchingCharacters1(){
        boolean actual = ParenChecker.checkMatchingCharacters("{}<>");
        Assert.assertTrue(actual);
    }
    @Test
    public void testCheckMatchingCharacters2(){
        boolean actual = ParenChecker.checkMatchingCharacters(">{}()<");
        Assert.assertFalse(actual);
    }

}