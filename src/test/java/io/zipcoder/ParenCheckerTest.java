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
    public void checkCharacters(){
        parenChecker = new ParenChecker("wuiebfui(ew)balhwbef");
        Assert.assertTrue(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters2(){
        parenChecker = new ParenChecker("wuiebfui(ew)b((alhwbef)");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters3(){
        parenChecker = new ParenChecker("wuiebfui(ew)b{a{l}hwbef)");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters4(){
        parenChecker = new ParenChecker("wuiebfui(ew)b{al}hwbef)");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters5(){
        parenChecker = new ParenChecker("({[<>]})");
        Assert.assertTrue(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters6(){
        parenChecker = new ParenChecker("({[<]>]})");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharacters7(){
        parenChecker = new ParenChecker("({[<{>]})");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharactersQuotes(){
        parenChecker = new ParenChecker("'''");
        Assert.assertFalse(parenChecker.checkCharacters());
    }

    @Test
    public void checkCharactersQuotes2(){
        parenChecker = new ParenChecker("''");
        Assert.assertTrue(parenChecker.checkCharacters());
    }

}