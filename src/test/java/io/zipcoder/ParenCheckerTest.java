package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {
 private  ParenChecker checker;
 private  String[] theString;
    @Before
    public void setUp() throws Exception {
        checker = new ParenChecker();
        theString = new String[]{"the (yo)", "the(,()", "the)", "the))", "the()()(", "the)()(", "()()()*()"};
    }

    @Test
    public void parenClosedCheckerTest(){
        String testString = theString[0];
        boolean expected =  true;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenOneOpenCheckerTest(){
        String testString = theString[1];
        boolean expected =  false;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenOneClosedCheckerTest(){
        String testString = theString[2];
        boolean expected =  false;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenTwoClosedCheckerTest(){
        String testString = theString[3];
        boolean expected =  false;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenTwClosedOneOpenCheckerTest(){
        String testString = theString[4];
        boolean expected =  false;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenOneClosedTwoOpenCheckerTest(){
        String testString = theString[5];
        boolean expected =  false;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parenFourClosedCheckerTest(){
        String testString = theString[6];
        boolean expected =  true;
        boolean actual = checker.verifyParens(testString);
        Assert.assertEquals(expected, actual);
    }








}