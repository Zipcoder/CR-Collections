package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParenCheckerTest {

    @Test
    public void testParensAllMatch() {
        String input = "{([\"'<>{<<>>}'\"()([['<>']])])}";

        Assert.assertTrue(ParenChecker.allParensMatch(input));
    }

    @Test
    public void testParensMismatched() {
        String input = "{<{\"<>\">}";
        Assert.assertFalse(ParenChecker.allParensMatch(input));
    }

    @Test
    public void testParensIgnoreUntilQuotesClosed() {
        String input = "{(\")\")}";
        Assert.assertTrue(ParenChecker.allParensMatch(input));
    }

    @Test
    public void testIsOpenParenYes() {
        String[] input = {"(", "[", "{", "\"", "'", "<"};
        for (String s : input)
            Assert.assertTrue(ParenChecker.isOpenParen(s));
    }

    @Test
    public void testEscape() {
        String input = "\\";
        Assert.assertTrue(ParenChecker.escaped(input));
    }

    @Test
    public void testGetClosingPartnerParen() {
        String input = "(";
        String expected = ")";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetClosingPartnerBracket() {
        String input = "[";
        String expected = "]";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetClosingPartnerBrace() {
        String input = "{";
        String expected = "}";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetClosingPartnerAngle() {
        String input = "<";
        String expected = ">";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetClosingPartnerDoubleQ() {
        String input = "\"";
        String expected = "\"";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetClosingPartnerSingleQ() {
        String input = "'";
        String expected = "'";
        String actual = ParenChecker.getClosingPartner(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOpenDQuote() {
        String input = "\"";

        Assert.assertTrue(ParenChecker.openQuote(input));
    }

    @Test
    public void testOpenSQuote() {
        String input = "'";

        Assert.assertTrue(ParenChecker.openQuote(input));
    }
}