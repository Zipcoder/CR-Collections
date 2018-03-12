package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenthesisChecker1() {
        Stack stack = new Stack();
        ArrayList charArrayList = new ArrayList();
        charArrayList.add('1');
        charArrayList.add('d');
        charArrayList.add('(');
        charArrayList.add('f');
        charArrayList.add('(');
        charArrayList.add(')');
        charArrayList.add(')');
        stack.addAll(charArrayList);
        ParenChecker parenChecker = new ParenChecker(stack);
        Assert.assertTrue(parenChecker.logicChecker());
    }

    @Test
    public void parenthesisChecker2() {
        Stack stack = new Stack();
        ArrayList charArrayList = new ArrayList();
        charArrayList.add('1');
        charArrayList.add('d');
        charArrayList.add('(');
        charArrayList.add('f');
        charArrayList.add('(');
        charArrayList.add(')');
        charArrayList.add(')');
        charArrayList.add(')');
        stack.addAll(charArrayList);
        ParenChecker parenChecker = new ParenChecker(stack);
        Assert.assertTrue(!(parenChecker.logicChecker()));
    }

    @Test
    public void parenthesisChecker3() {
        Stack stack = new Stack();
        ArrayList charArrayList = new ArrayList();
        charArrayList.add(')');
        charArrayList.add('1');
        charArrayList.add('d');
        charArrayList.add('(');
        charArrayList.add('f');
        charArrayList.add('(');
        charArrayList.add(')');
        charArrayList.add(')');
        charArrayList.add(')');
        stack.addAll(charArrayList);
        ParenChecker parenChecker = new ParenChecker(stack);
        Assert.assertTrue(!(parenChecker.logicChecker()));
    }

}