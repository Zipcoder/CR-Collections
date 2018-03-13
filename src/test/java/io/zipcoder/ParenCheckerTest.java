package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;


public class ParenCheckerTest {

    @Test
    public void parenthesisCheckerTest() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString = "()";
        boolean actual = parenthesisTest.parenChecker(testString);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenthesisCheckerTest2() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString2 = "()(";
        boolean actual = parenthesisTest.parenChecker(testString2);

        //Then
        Assert.assertFalse(actual);
    }
    @Test
    public void parenthesisCheckerTest3() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString3 = "(i)p(";
        boolean actual = parenthesisTest.parenChecker(testString3);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenthesisCheckerTest4() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString4 = "a(ki)loop(jj)hi";
        boolean actual = parenthesisTest.parenChecker(testString4);

        //Then
        Assert.assertTrue(actual);
    }


    @Test
    public void pairCheckerTest1() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();


        //When
        String testString2 = ")()(";
        boolean actual = parenthesisTest.pairOfParenthesies(testString2);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void pairCheckerTest2() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString = "[]<>";
        boolean actual = parenthesisTest.pairOfParenthesies(testString);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void pairCheckerTest3() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();


        //When
        String testString3 = "atom)p(min)low(da";
        boolean actual = parenthesisTest.pairOfParenthesies(testString3);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void pairCheckerTest4() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString4 = "do[re]mi<fig>aro";
        boolean actual = parenthesisTest.pairOfParenthesies(testString4);

        //Then
        Assert.assertTrue(actual);
    }
}