package io.zipcoder;

/**
 * filename:
 * project: collections
 * author: https://github.com/vvmk
 * date: 3/12/18
 */
public enum Enclosure {
    PAREN("(", ")"),
    BRACKET("[", "]"),
    BRACE("{", "}"),
    ANGLE("<",">"),
    SQUOTE("'","'"),
    DQUOTE("\"", "\"");

    private String open;
    private String close;

    Enclosure(String open, String close) {
        this.open = open;
        this.close = close;
    }

    public static String getClose(String openStr) {
        for (Enclosure e : Enclosure.values()) {
            if (e.open.equals(openStr))
                return e.close;
        }
        return null;
    }
}
