package com.DSAbootcamp;

public class Permutation_recurssion {
    public static void main(String[] args) {
        permutate("", "abc");
        System.out.println(noOfPermutations("","abc"));

    }
    static  void permutate(String newString, String originalString){
        if (originalString.isEmpty()) {
            System.out.println(newString);
            return;
        }

        char ch = originalString.charAt(0);

        for (int i = 0; i <=newString.length() ; i++) {
            String first = newString.substring(0,i);
            String second = newString.substring(i,newString.length());
            permutate(first+ch+second,originalString.substring(1));
        }
    }

    static  int noOfPermutations(String newString, String originalString){
        if (originalString.isEmpty()) {

            return 1;
        }

        char ch = originalString.charAt(0);
        int count =0;

        for (int i = 0; i <=newString.length() ; i++) {
            String first = newString.substring(0,i);
            String second = newString.substring(i,newString.length());
            count= count + noOfPermutations(first+ch+second,originalString.substring(1));
        }
        return count;
    }
}
