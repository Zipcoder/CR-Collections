package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ParenCheckerTest {

    @Test
    public void parenCheckTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String string1 = "I love ( cheese )";
        boolean actual = parenTest.parenCheck(string1);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheck2Test(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String string2 = "I really ( love cheese";

        //Then
        Assert.assertFalse(parenTest.parenCheck(string2));
    }

    @Test
    public void parenPairsTest(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        //When
        String string1 = "I really ( love cheese ) and { chicken }";

        //Then
        Assert.assertTrue(parenTest.parenPairs(string1));

    }

    @Test
    public void parenPairs2Test(){
        //Given
        ParenChecker parenTest = new ParenChecker();

        String string1 = "I really ( love cheese ) a{n]d { chicken";

        Assert.assertFalse(parenTest.parenPairs(string1));

    }
}