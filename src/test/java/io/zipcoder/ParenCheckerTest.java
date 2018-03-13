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
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest2(){
        //Given
        String test = "((";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest3(){
        //Given
        String test = ")(";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyParensArePairedTest4(){
        //Given
        String test = "(";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyOpeningCharactersHaveAClosingOneTest(){

    }
    @Test
    public void verifyOpeningCharactersHaveAClosingOneTest2(){
        //Given
        String test = "()";
        boolean expected = true;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyOpeningCharactersHaveAClosingOneTest3(){
        //Given
        String test = "((";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void verifyOpeningCharactersHaveAClosingOneTest4(){
        //Given
        String test = ")(";
        boolean expected = false;
        //When
        boolean actual = parenCheckerTest.verifyParensArePaired(test);
        Assert.assertEquals(expected,actual);
    }
}