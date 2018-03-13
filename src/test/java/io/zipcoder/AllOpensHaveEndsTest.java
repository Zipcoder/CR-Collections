package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllOpensHaveEndsTest {
   private ParenChecker theCheck;
    @Before
    public void setUp() throws Exception {
        theCheck = new ParenChecker();
    }

    @Test
    public void verifyAllOpensHaveEndsTest() {
        String testString = "()";
        boolean expect = true;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void verifyAllOpensHaveEnds1Test() {
        String testString = "()(/////////////////////////////////)";
        boolean expect = true;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void verifyAllOpensHaveEndsFalseTEst() {
        String testString = "((";
        boolean expect = false;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void verifyAllOpensHaveEndsFalse1Test() {
        String testString = "((/////////////////////////////)";
        boolean expect = false;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }



    @Test
    public void verifyAllOpensHaveEndsFalse2Test() {
        String testString = "((/////////////////////////////)}}}}}}}}}}}}}}}}}}}}}}}}{{{{{{{{{{{{{{{}}}";
        boolean expect = false;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void verifyAllOpensHaveEndsTrueTest() {
        String testString = "((/////////////////////////////))<>";
        boolean expect = true;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void verifyAllOpensHaveEndsfalseTest() {
        String testString = "((/////////////////////////////))<";
        boolean expect = false;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void verifyAllOpensHaveEnds2Test() {
        String testString = "sfsdfkjdsljfl";
        boolean expect = true;
        boolean actual = theCheck.verifyAllOpensHaveEnds(testString);

        Assert.assertEquals(expect, actual);
    }





}