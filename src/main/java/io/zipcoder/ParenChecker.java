package io.zipcoder;

import java.util.Stack;
import java.util.regex.Pattern;

public class ParenChecker {
    public static boolean allParensMatch(String input) {
        Stack<String> stack = new Stack<>();
        String[] letters = input.split("");

        for (String letter : letters) {
            if (!stack.empty()) {
                String head = stack.peek();

                if (escaped(head) || letter.equals(getClosingPartner(head))) {
                    stack.pop();
                    continue;
                }

                if (openQuote(head))
                    continue;
            }

            if (isOpenParen(letter))
                stack.push(letter);
        }
        return stack.isEmpty();
    }

    public static boolean escaped(String s) {
        return s.equals("\\");
    }

    public static String getClosingPartner(String open) {
        return Enclosure.getClose(open);
    }

    public static boolean openQuote(String letter) {
        Pattern p = Pattern.compile("[\\\"\\']+");
        return p.matcher(letter).matches();
    }

    public static boolean isOpenParen(String candidate) {
        Pattern p = Pattern.compile("[\\\\\\[\\{\\(\\<\\\"\\']+");
        return p.matcher(candidate).matches();
    }


}
