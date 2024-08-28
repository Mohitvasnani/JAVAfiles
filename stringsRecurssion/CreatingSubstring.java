package com.DSAbootcamp.stringsRecurssion;

public class CreatingSubstring {
    public static void main(String[] args) {
        subs("","abc");
    }
    static void subs(String subStr, String str){
        if (str.isEmpty()) {
            System.out.println(subStr);
            return;
        }
        char ch = str.charAt(0);
        //concatenating with one
        subs(subStr+ch,str.substring(1));
        //ignoring other characters of string
        subs(subStr,str.substring(1));
    }
}
