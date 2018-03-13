package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void isPairedParenthesis1(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "()()()()()";

        boolean expected = true;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPairedParenthesis2(){
        ParenChecker parenChecker = new ParenChecker();
        String str = ")()()()()()";

        boolean expected = false;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void isPairedParenthesis3(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "))()()()()";

        boolean expected = false;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isBalancedBrackets1(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "([])({})(<>)()()";

        boolean expected = true;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isBalancedBrackets2(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "[](){}()()()()";

        boolean expected = true;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isBalancedBrackets3(){
        ParenChecker parenChecker = new ParenChecker();
        String str = "({})(<>)()()()";

        boolean expected = true;
        boolean actual = parenChecker.isPairedParenthesis(str);

        Assert.assertEquals(expected, actual);

    }

}