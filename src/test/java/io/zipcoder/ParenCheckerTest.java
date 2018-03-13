package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenCheckerTest {

    @Test
    public void testParenChecker(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "I rock (rough) and stuff with my (afro) puffs!";
        //When
        boolean pairParen = parenChecker.parenChecker(value);
        Assert.assertTrue(pairParen);
    }

    @Test
    public void testParenChecker2(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "{(/)}<";
        //When
        boolean pairParen = parenChecker.parenChecker(value);
        Assert.assertTrue(pairParen);
    }

    @Test
    public void testPairParen(){
        //Given
        ParenChecker parenTest = new ParenChecker();
        String value = "I love <TDD> so much";
        //When
        Assert.assertTrue(parenTest.pairParen(value));
    }

    @Test
    public void testPairParen2(){
        //Given
        ParenChecker parenTest = new ParenChecker();
        String value = "<Zip Code Wilmington> pow (pow)";
        //When
        Assert.assertTrue(parenTest.pairParen(value));
    }


}