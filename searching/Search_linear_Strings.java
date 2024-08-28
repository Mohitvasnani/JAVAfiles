package com.DSAbootcamp.searching;

public class Search_linear_Strings {
    public static void main(String[] args) {
        String name = "mohit";
        char target = 'h';
        System.out.println(search(name, target));

    }
     static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
         for (int i = 0; i <str.charAt(i) ; i++) {
             if (target==str.charAt(i)){
                 return true;
             }
         }
         return false;
     }
}
