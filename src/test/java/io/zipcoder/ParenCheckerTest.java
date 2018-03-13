package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenCheckerTest {

    @Test
    public void TestParenChecker(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "I rock (rough) and stuff with my (afro) puffs!";
        //When
        boolean pairParen = parenChecker.parenChecker(value);
        Assert.assertFalse(pairParen);
    }
}