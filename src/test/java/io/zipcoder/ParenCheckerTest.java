package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenCheckerTest {

    private ParenChecker tester;

    @Before
    public void setup() {
        tester = new ParenChecker();
    }

    @Test
    public void verifyClosingParensTest1() {
        String input = "Hello (or hi) world.";
        Assert.assertTrue(tester.verifyClosingParens(input));
    }

    @Test
    public void verifyClosingParensTest2() {
        String input = "I (me) need (want) to go.";
        Assert.assertTrue(tester.verifyClosingParens(input));
    }

    @Test
    public void verifyClosingParensTest3() {
        String input = "This one (the one (right here) should return false";
        Assert.assertFalse(tester.verifyClosingParens(input));
    }

    @Test
    public void verifyClosingParensTest4() {
        String input = "What is this ) doing here?";
        Assert.assertFalse(tester.verifyClosingParens(input));
    }

    @Test
    public void verifyClosingParensTest5() {
        String input = "This (is (just for) testing).";
        Assert.assertTrue(tester.verifyClosingParens(input));
    }

    @Test
    public void verifyAllClosingTypesTest6() {
        String input = "Thi(s[] is (jus<t for) test>ing).";
        Assert.assertFalse(tester.verifyAllClosingTypes(input));
    }

    @Test
    public void verifyAllClosingTypesTest7() {
        String input = "Th(is <>is (jus}t for) te{sting).";
        Assert.assertFalse(tester.verifyAllClosingTypes(input));
    }

    @Test
    public void verifyAllClosingTypesTest8() {
        String input = "(){}[]<>";
        Assert.assertTrue(tester.verifyAllClosingTypes(input));
    }

    @Test
    public void verifyAllClosingTypesTest9() {
        String input = "Th(is <is [just] for> testing).";
        Assert.assertTrue(tester.verifyAllClosingTypes(input));
    }

    @Test
    public void verifyAllClosingTypesTest10() {
        String input = "{hello>";
        Assert.assertFalse(tester.verifyAllClosingTypes(input));
    }

    @Test
    public void verifyAllClosingTypesTest11() {
        String input = "h[e'l'l]o";
        Assert.assertTrue(tester.verifyAllClosingTypes(input));
    }
}