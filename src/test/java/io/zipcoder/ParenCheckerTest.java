package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void addToStackTestWithoutSpaces() {
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.add("h el l o");
        String actual = parenChecker.getCharString();
        Assert.assertEquals("[h, e, l, l, o]", actual);
    }

    @Test
    public void addToStackTestReal() {
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.add("()()() /// 31");
        String actual = parenChecker.getCharString();
        Assert.assertEquals("[(, ), (, ), (, ), /, /, /, 3, 1]", actual);
    }

    @Test
    public void isOpenTest1() {
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.add("()()() /// 31");
        Assert.assertFalse(parenChecker.isOpen());
    }

    @Test
    public void isOpenTest2() {
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.add("hegd(dfsg)dfsg((( '' ' \" \"");
        Assert.assertTrue(parenChecker.isOpen());
    }

    @Test
    public void isOpenTest3() {
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.add("()()() {} [] '' \" \" ");
        Assert.assertFalse(parenChecker.isOpen());
    }
}