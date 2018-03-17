package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenCheckerTest {

   private ParenChecker testChecker;

   @Before
    public void setup(){
       testChecker = new ParenChecker();
   }

   @Test
    public void testStack1() {
       String input = "Hello (world) hell";
       Assert.assertTrue(testChecker.checkForPairOfParens(input));
   }

    @Test
    public void testStack2() {
        String input = "Hello (world) hell (world)";
        Assert.assertTrue(testChecker.checkForPairOfParens(input));
    }

    @Test
    public void testStack3() {
        String input = "Hello (ftox (world) hell (world)";
        Assert.assertFalse(testChecker.checkForPairOfParens(input));
    }

    @Test
    public void testStack4() {
        String input = "oh )hey";
        Assert.assertFalse(testChecker.checkForPairOfParens(input));
    }

//    @Test
//    public void testStack5() {
//        String input = "Hello (world) hell";
//        Assert.assertTrue(testChecker.checkForPairOfParens(input));
//    }

    @Test
    public void testStack5() {
        String input = "inside (20394 an (iowieur) inside)3948";
        Assert.assertTrue(testChecker.checkForPairOfParens(input));
    }

    @Test
    public void testCheckForPairs1(){
       String input = "oiwoieng()oiwejro[{)}]0w934";
       Assert.assertFalse(testChecker.checkForPairs(input));
    }

    @Test
    public void testCheckForPairs2(){
        String input = "oiwoieng()oiwejro[{}]0w934";
        Assert.assertTrue(testChecker.checkForPairs(input));
    }

}