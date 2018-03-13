package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {


    @Test
    public void checkParenthesesTest1() {
        // Given
        ParenChecker testParentheses = new ParenChecker();

        // When
        String string1 = "Eagles are (Super Bowl) Champs";
        boolean actual = testParentheses.checkParentheses(string1);

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void checkParenthesesTest2() {
        // Given
        ParenChecker testParentheses = new ParenChecker();

        // When
        String string2 = "Cowboys will not be (Super Bowl Champs anytime soon";
        boolean actual = testParentheses.checkParentheses(string2);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openAndClosedCharactersTest1() {
        // Given
        ParenChecker testParentheses = new ParenChecker();

        // When
        String string1 = "Eagles will [repeat] as (Super Bowl) Champs";
        boolean actual = testParentheses.openAndClosedCharacters(string1);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openAndClosedCharactersTest2() {
        // Given
        ParenChecker testParentheses = new ParenChecker();

        // When
        String string2 = "[Cowboys] will not be (Super Bowl Champs> {anytime soon";
        boolean actual = testParentheses.openAndClosedCharacters(string2);

        // Then
        Assert.assertFalse(actual);
    }
}