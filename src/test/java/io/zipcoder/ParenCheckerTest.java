package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static io.zipcoder.ParenChecker.CheckParentesis;

public class ParenCheckerTest {

    @Test
    public void parenCheckerTest1() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "()";

        // When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest2() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "()(";

        // When
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest3() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = ")()(";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest4() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "a(d)a";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest5() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "a(da";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing1() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "({()})";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing2() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "({)})";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing3() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "\"\'({})\'\"";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void openingAndClosing4() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "c\"c\'c(d{a}d)d\'c\"c";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing5() {
        // Given
        Stack<Character> stack = new Stack<Character>();
        String parenString = "c\"c\'c}d)d\'c\"c";

        //When
        Assert.assertEquals(true, stack.isEmpty());
        Boolean actual = CheckParentesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }




}