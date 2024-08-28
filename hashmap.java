package com.DSAbootcamp;

import java.util.HashSet;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        String sentence = "abcdefghijkzlmnopqqrstuwvxyz";
        System.out.println(panagram(sentence));

    }
    static boolean panagram(String str){
        Set <Character> set = new HashSet<>();
        for (int i = 0; i < str.length() ; i++) {
            set.add(str.charAt(i));
        }
        if (set.size()==26){
            return true;
        }

        return false;
    }
}
