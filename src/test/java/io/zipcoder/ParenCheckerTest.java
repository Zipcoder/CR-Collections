package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.ws.RequestWrapper;

public class ParenCheckerTest {

    @Test
    public void parenCheckerTest1(){
        ParenChecker testChecker = new ParenChecker();
        boolean actual = testChecker.parenChecker("()()<>\"\"[]{}\'\'");
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest2(){
        ParenChecker testChecker = new ParenChecker();
        boolean actual = testChecker.parenChecker("ufeuifbbifeiu><<()");
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest3(){
        ParenChecker testChecker = new ParenChecker();
        boolean actual = testChecker.parenChecker("\"(({}))\"");
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest4(){
        ParenChecker testChecker = new ParenChecker();
        boolean actual = testChecker.parenChecker("fsf(kfbf{}jnje)<>\"dsdjhsjdhj\"");
        Assert.assertTrue(actual);
    }

}

