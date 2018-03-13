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
        String test = ")aBcD()eFgHiJkLmN()(";

        //When

        //Then
        Assert.assertFalse(ParenChecker.parenthesesAreAllClosed(test));
    }

    @Test
    public void allCharactersAreClosedTest(){
        //Given
        String test = "<9>(8){*}[+]\"7\"'1'";

        //When

        //Then
        Assert.assertTrue(ParenChecker.allCharactersAreClosed(test));
    }

    @Test
    public void allCharactersAreClosedTest2(){
        //Given
        String test = "<<<((({{{[[['''\"\"\">>>]]]}}})))\"\"\"'''";

        //When

        //Then
        Assert.assertTrue(ParenChecker.allCharactersAreClosed(test));
    }

    @Test
    public void allCharactersAreNotClosedTest(){
        //Given
        String test = "<9>(8){*}[+]\"7'1'";

        //When

        //Then
        Assert.assertFalse(ParenChecker.allCharactersAreClosed(test));
    }

    @Test
    public void allCharactersAreNotClosedTest2(){
        //Given
        String test = "'<9>(8){*}[+]\"7\"'1'";

        //When

        //Then
        Assert.assertFalse(ParenChecker.allCharactersAreClosed(test));
    }



}