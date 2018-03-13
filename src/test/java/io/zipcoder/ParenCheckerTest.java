package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenCheckerTest() {
        //Given
        ParenChecker parenChecker = new ParenChecker();


        String string1 = "I love (Luke)";
        String string2 = "I love (Cars)";
        String string3 = "I love coding)";


        boolean actual = parenChecker.parenCheck(string3);

        Assert.assertFalse(actual);


    }

    @Test
    public void parenCheckerTest1() {
        //Given
        ParenChecker parenChecker = new ParenChecker();


        String string1 = "I love (Luke)";
        String string2 = "I love (Cars)";
        String string3 = "I love coding)";


        Assert.assertTrue(parenChecker.parenCheck(string1));

    }

    @Test
    public void parenCheckerTest2() {
        //Given
        ParenChecker parenChecker = new ParenChecker();


        String string1 = "I love (Luke)";
        String string2 = "I love (Cars)";
        String string3 = "I \"love\" { { [c] }}o\'d\'ing)";


        boolean actual = parenChecker.allCheck(string3);

        Assert.assertFalse(actual);


    }

    @Test
    public void parenCheckerTest4() {
        //Given
        ParenChecker parenChecker = new ParenChecker();


        String string1 = "I love (Luke)";
        String string2 = "I love (Cars)";
        String string3 = "I (\"love\" { { [c] }}oding)\"";


        Assert.assertTrue(parenChecker.allCheck(string3));

    }

    @Test
    public void parenCheckerTest5() {
        //Given
        ParenChecker parenChecker = new ParenChecker();


        String string1 = "I love (Luke)";
        String string2 = "I {love >Cars";
        String string3 = "I (\"love\" { { [c] }}oding)\"";


        Assert.assertFalse(parenChecker.allCheck(string2));

    }
}