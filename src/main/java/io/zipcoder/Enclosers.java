package io.zipcoder;

import java.util.ArrayList;

public enum Enclosers {
    PAREN("(", ")"),
    CURLY("{", "}"),
    BRACKET("[", "]"),
    CAROT("<", ">"),
    DQUOTE("\"", "\""),
    SQUOTE("'", "'")
    ;

    private String open;
    private String close;

    Enclosers(String open, String close){
        this.open = open;
        this.close = close;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }
}
