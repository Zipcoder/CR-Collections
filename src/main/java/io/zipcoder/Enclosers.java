package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public enum Enclosers {
    PAREN("(", ")"),
    CURLY("{", "}"),
    BRACKET("[", "]"),
    CAROT("<", ">"),
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
