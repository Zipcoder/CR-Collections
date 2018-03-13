package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenCheckTest(){
        //Given
        ParenChecker parenCheck = new ParenChecker();
        parenCheck.getPunctuationPairs().push("(");
        parenCheck.getPunctuationPairs().push("a");
        parenCheck.getPunctuationPairs().push(")");

        //you look through stack for ( & ), you expect to find
        boolean expected = true;
        //Then : you look through the stack looking for a ( for each ), and you will find
        boolean actual = parenCheck.parenCheck();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void surroundCheck(){
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push(" ");
        parenChecker.getPunctuationPairs().push("{");
        boolean expected = false;
        boolean actual = parenChecker.surround();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void surroundCheck2(){
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("(");
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("}");
        boolean expected = false;
        boolean actual = parenChecker.surround();
        Assert.assertEquals(expected, actual);
    }
}