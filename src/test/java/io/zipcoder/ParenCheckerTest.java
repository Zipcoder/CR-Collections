package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenCheckTest(){
        ParenChecker parenCheck = new ParenChecker();
        parenCheck.getPunctuationPairs().push("(");
        parenCheck.getPunctuationPairs().push("a");
        parenCheck.getPunctuationPairs().push(")");

        Assert.assertTrue(parenCheck.parenCheck());
    }

    @Test
    public void surroundCheck(){
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push(" ");
        parenChecker.getPunctuationPairs().push("{");

        Assert.assertFalse(parenChecker.surround());
    }

    @Test
    public void surroundCheck2(){
        ParenChecker parenChecker = new ParenChecker();
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
        ParenChecker parenChecker = new ParenChecker();
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
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("]");

        Assert.assertFalse(parenChecker.surround());
    }

    @Test
    public void surroundCheck5(){
        ParenChecker parenChecker = new ParenChecker();
        parenChecker.getPunctuationPairs().push("{");
        parenChecker.getPunctuationPairs().push("}");
        parenChecker.getPunctuationPairs().push("(");
        parenChecker.getPunctuationPairs().push(")");
        parenChecker.getPunctuationPairs().push("[");
        parenChecker.getPunctuationPairs().push("]");

        Assert.assertTrue(parenChecker.surround());
    }
}