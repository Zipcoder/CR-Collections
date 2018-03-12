package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void openAndCloseTest(){
        //Given
        String test = "aBcD(eFg)HiJ(kLmN)";

        //When

        //Then
        Assert.assertTrue(ParenChecker.parenthesesAreAllClosed(test));

    }

    @Test
    public void openNoCloseTest(){
        //Given
        String test = "aBcD(eFgHiJ(kLmN)";

        //When

        //Then
        Assert.assertFalse(ParenChecker.parenthesesAreAllClosed(test));
    }

    @Test
    public void closeNoOpenTest(){
        //Given
        String test = "aBcD()eFgHiJkLmN)";

        //When

        //Then
        Assert.assertFalse(ParenChecker.parenthesesAreAllClosed(test));
    }

    @Test
    public void closeNoOpenTest2(){
        //Given
        String test = ")aBcD()eFgHiJkLmN()";

        //When

        //Then
        Assert.assertFalse(ParenChecker.parenthesesAreAllClosed(test));
    }

}