package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    ParenChecker parenChecker = new ParenChecker();

    @Test
    public void parenCheckTest(){
        parenChecker.getPunctuationPairs().push("(");
        parenChecker.getPunctuationPairs().push("a");
        parenChecker.getPunctuationPairs().push(")");

        Assert.assertTrue(parenChecker.parenCheck());
    }

    @Test
    public void surroundCheck(){
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push(" ");
        parenChecker.getPunctuationPairs().push("{");

        Assert.assertFalse(parenChecker.surround());
    }

    @Test
    public void surroundCheck2(){
        parenChecker.getPunctuationPairs().push("[");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("(");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("]");

        Assert.assertTrue(parenChecker.surround());
    }

    @Test
    public void surroundCheck3(){
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("]");
        parenChecker.getPunctuationPairs().push("[");

        Assert.assertFalse(parenChecker.surround());
    }

    @Test
    public void surroundCheck4(){
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("]");

        Assert.assertFalse(parenChecker.surround());
    }

    @Test
    public void surroundCheck5(){
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("(");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("[");
        parenChecker.getPunctuationPairs().push("]");

        Assert.assertTrue(parenChecker.surround());
    }
}