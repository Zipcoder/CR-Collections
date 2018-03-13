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
        String testString = "(";
        boolean actual = parenthesisTest.parenChecker(testString);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenthesisCheckerTest3() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString2 = "()<>";
        boolean actual = parenthesisTest.pairOfParenthesies(testString2);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenthesisCheckerTest4() {
        //Given
        ParenChecker parenthesisTest = new ParenChecker();

        //When
        String testString = "()<>''";
        boolean actual = parenthesisTest.pairOfParenthesies(testString);

        //Then
        Assert.assertFalse(actual);
    }
}
// Single (
// more than one set () <>
// more than two sets () <> ''