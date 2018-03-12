package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void testParens(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "Hello, I am method()";
        boolean expected = true;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testParensNotPaired(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "Unpaired )";
        boolean expected = false;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testParensWordIn(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "(Hello)";
        boolean expected = true;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testParensHalf(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "(e))";
        boolean expected = false;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testParensRandom(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "asl(kAsdlajsldjadasdj())dljsa";
        boolean expected = true;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testOthers(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "dasdads\"dasdasdad\"";
        boolean expected = true;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFailOther(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "\"Hello' I am not right\"";
        boolean expected = false;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMulti(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "RR{}R[R]R>";
        boolean expected = false;
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDontKnow(){
        ParenChecker testChecker = new ParenChecker();
        String parens = "alsjdalkjs\"\"d<()(A)D(ASD()[]}[";
        boolean actual = testChecker.parenChecker(parens);
        Assert.assertFalse(actual);
    }
}