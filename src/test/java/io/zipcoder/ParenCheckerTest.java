package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static io.zipcoder.ParenChecker.CheckParentesis;
import static io.zipcoder.ParenChecker.openingAndClosing;

public class ParenCheckerTest {

    @Test
    public void parenCheckerTest1() {
        // Given
        String parenString = "()";

        // When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest2() {
        // Given
        String parenString = "()(";

        // When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest3() {
        // Given
        String parenString = ")()(";

        //When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest4() {
        // Given
        String parenString = "a(d)a";

        //When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest5() {
        // Given
        String parenString = "a(da";

        //When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing1() {
        // Given;
        String openingAndClosingString = "({()})";

        //When
        Boolean actual = openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing2() {
        // Given
        String openingAndClosingString = "({)})";

        //When
        Boolean actual = openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing3() {
        // Given
        String openingAndClosingString = "\"\'({})\'\"";

        //When
        Boolean actual = openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void openingAndClosing4() {
        // Given
        String openingAndClosingString = "c\"c\'c(d{a}d)d\'c\"c";

        //When
        Boolean actual = openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing5() {
        // Given
        String openingAndClosingString = "c\"c\'c}d)d\'c\"c";

        //When
        Boolean actual = openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertFalse(actual);
    }




}