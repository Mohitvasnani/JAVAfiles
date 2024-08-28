package com.DSAbootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//       int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        rev_arr(arr);
//
//        String a = "    mohit   vas";
//        System.out.println(a);
//        System.out.println(a.strip());
//        a.split("\\s");
//
//        System.out.println(sqrt(28));


            String string1 = "Great responsibility";
            int count;

            //Converts given string into character array
            char string[] = string1.toCharArray();

            System.out.println("Duplicate characters in a given string: ");
            //Counts each character present in the string
            for(int i = 0; i <string.length; i++) {
                count = 1;
                for(int j = i+1; j <string.length; j++) {
                    if(string[i] == string[j] && string[i] != ' ') {
                        count++;
                        //Set string[j] to 0 to avoid printing visited character
                        string[j] = '0';
                    }
                }
                //A character is considered as duplicate if count is greater than 1
                if(count > 1 && string[i] != '0')
                    System.out.println(string[i]);
            }
        }




    static void rev_arr(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int sqrt(int num){
        int low =1;
        int ans = 0;
        int high = num;
        while (low <= high){
            int mid = (low+high)/2;
            if (mid*mid<=num){
                ans = mid;
                low = mid +1;
            }
            else {
                high =mid -1;
            }
        }
        return ans;
    }
}
