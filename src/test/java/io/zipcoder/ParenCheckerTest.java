package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void parenCheckerTest(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String s = ")()(";
        //When
        boolean allPair = parenChecker.parenChecker(s);
        //Then
        Assert.assertFalse(allPair);
    }
    @Test
    public void parenCheckerTest2(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String s = "()()";
        //When
        boolean hasAllPair = parenChecker.parenChecker(s);
        //Then
        Assert.assertTrue(hasAllPair);
    }
    @Test
    public void pairCheckerTest(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String s = "{true}";
        //When
        boolean hasPair = parenChecker.pairChecker(s);
        //Then
        Assert.assertTrue(hasPair);
    }
    @Test
    public void pairCheckTest2(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String s = "<False pacman mouth<";
        //When
        boolean hasPair = parenChecker.pairChecker(s);
        //Then
        Assert.assertFalse(hasPair);
    }
    @Test
    public void pairCheckerTest3(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String s = "[size]";
        //When
        boolean hasPair = parenChecker.pairChecker(s);
        //Then
        Assert.assertTrue(hasPair);
    }
}