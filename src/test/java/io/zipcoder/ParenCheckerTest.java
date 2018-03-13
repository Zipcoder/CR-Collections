package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void testCheckParenOne(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "(This is a test) string with some (parenthesis)";

        boolean expected = true;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCheckParenTwo(){
        ParenChecker parenChecker = new ParenChecker();
        String str = ")This is a test( string with some (parenthesis)";

        boolean expected = false;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckParenThree(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "(This is( a test (string with some parenthesis)";

        boolean expected = false;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckParenFour(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "<This {[is( a test string with} some parenthesis)>]";

        boolean expected = false;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckParenFive(){
        ParenChecker parenChecker = new ParenChecker();
        String str = " <{[( )]} >";

        boolean expected = true;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckParenSix(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "< This ' is a ' test \"String\" with some parenthesis>";

        boolean expected = true;
        boolean actual = parenChecker.checkParen(str);
        Assert.assertEquals(expected, actual);
    }


}