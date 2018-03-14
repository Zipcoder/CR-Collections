package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {
    ParenChecker parenChecker = new ParenChecker();

    @Test
    public void isPaired1Test(){
        //Given
        String strToCheck = "(UltraInstinct)";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired1Test(){
        //Given
        String strToCheck = "(UltraInstinct";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPaired2Test(){
        //Given
        String strToCheck = "{}UltraInstinct";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired2Test(){
        //Given
        String strToCheck = "UltraInstinct}";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPaired3Test(){
        //Given
        String strToCheck = "[Ultra]Instinct";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired3Test(){
        //Given
        String strToCheck = "UltraInstin]ct";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPaired4Test(){
        //Given
        String strToCheck = "Ultra<>Instinct";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired4Test(){
        //Given
        String strToCheck = "UltraInstinc>>t";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void isPaired5Test(){
        //Given
        String strToCheck = "Ultra\"Instinc\"t";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired5Test(){
        //Given
        String strToCheck = "Ultra\"Instinct";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPaired6Test(){
        //Given
        String strToCheck = "Ult\'raIn\'stinct";
        Boolean expected = true;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotPaired6Test(){
        //Given
        String strToCheck = "Ultra\'Inst\'inct\'";
        Boolean expected = false;

        //When
        boolean actual = parenChecker.braceChecker(strToCheck);

        //Then
        Assert.assertEquals(expected,actual);
    }

}