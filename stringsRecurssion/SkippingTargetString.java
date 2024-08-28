package com.DSAbootcamp.stringsRecurssion;

public class SkippingTargetString {
    public static void main(String[] args) {
        System.out.println(skip("applepie"));
        System.out.println(skip("callapplecd"));
        System.out.println(skip("bbapple"));

    }
    static String skip(String target){
        if (target.isEmpty()) {
            return "";
        }
        if (target.startsWith("apple") ) {
            return skip(target.substring(5));
        }
        else {
            return target.charAt(0) + skip(target.substring(1));
        }
    }
}
