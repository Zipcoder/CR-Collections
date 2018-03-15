package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {
    ParenChecker parenCheckerTest = new ParenChecker();
    @Test
    public void verifyParensArePairedTest(){
        //Given
        String test = "()";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest2(){
        //Given
        String test = "((";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest3(){
        //Given
        String test = ")(";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest4(){
        //Given
        String test = "(";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParenthesesHaveOpenAndClosingOneTest(){
        //Given
        String test = "()";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void verifyCurlyBraceHaveOpenAndClosingOneTest(){
        //Given
        String test = "{}";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void verifyBracketHaveOpenAndClosingOneTest(){
        //Given
        String test = "[]";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyDiamondsHaveOpenAndClosingOneTest(){
        //Given
        String test = "<>";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyDiamondsHaveOpenAndClosingOneTestFail(){
        //Given
        String test = "<";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyDoubleQuotesHaveOpenAndClosingOneTest(){
        //Given
        String test = "\"\"";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifySingleQuotesHaveOpenAndClosingOneTest(){
        //Given
        String test = "''";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyOpeningCharactersHaveAClosingOne(test);
        Assert.assertEquals(expected,actual);
    }
}