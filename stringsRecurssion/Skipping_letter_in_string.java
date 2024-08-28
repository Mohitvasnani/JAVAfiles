package com.DSAbootcamp.stringsRecurssion;

import java.util.Scanner;

public class Skipping_letter_in_string {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter string");
//        String str = sc.next();
//        twoArgSkip("",str);

        System.out.println(oneArgSkip("abba"));



    }
    static void twoArgSkip(String new_string, String original_string){
        if (original_string.isEmpty()) {
            System.out.println(new_string);
            return;
        }
        char ch = original_string.charAt(0);
        if (ch == 'a'){
            twoArgSkip(new_string,original_string.substring(1));
        }
        else {
            twoArgSkip(new_string+ch,original_string.substring(1));
        }
    }

    static String oneArgSkip(String original_string){
        if (original_string.isEmpty()) {
            return "";
        }
        char ch = original_string.charAt(0);
        if (ch == 'a'){
           return oneArgSkip(original_string.substring(1));
        }
        else {
            return ch + oneArgSkip( original_string.substring(1));
        }
    }



}
