package io.zipcoder;

import java.util.Stack;

public class ParenChecker {

        private PairedChecker checker;

        public ParenChecker() {
            this.checker = new PairedChecker();
        }


    /**
     * Check to see if open and closing paren's are balanced
     * @param inputString string that is iterated over
     * @return true if all parenthesis in string are matched
     */
    public boolean check(String inputString) {
            return this.checker.check('(', ')', inputString);
        }
    }