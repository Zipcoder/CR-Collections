package io.zipcoder;

public enum SpecialCharactersEnum {
    PARENTHESIS("(", ")"),
    CURLY_BRACES("{", "}"),
    SQUARE_BRACKETS("[","]"),
    CHEVRONS("<", ">"),
    SINGLE_QUOTES("\'", "\'"),
    DOUBLE_QUOTES("\"", "\"");

    private final String beginChar;
    private final String endChar;

    SpecialCharactersEnum(String beginChar, String endChar){
        this.beginChar = beginChar;
        this.endChar = endChar;
    }

    public String getBeginChar(){
        return beginChar;
    }

    public String getEndChar(){
        return endChar;
    }

    public String getOppositeChar(String str){
        String opposite = "";
        if(str.equals(beginChar)) opposite = endChar;
        if(str.equals(endChar)) opposite = beginChar;
        return opposite;
    }



}
