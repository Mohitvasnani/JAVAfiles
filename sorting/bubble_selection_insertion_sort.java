package com.DSAbootcamp.sorting;

import java.util.Arrays;

public class bubble_selection_insertion_sort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void insertionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
               for (int j = i + 1; j >0; j--){
                if (arr[j] < arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int smaller_no = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[smaller_no]){
                    smaller_no = j;//searching for lowest smaller_no
                }
            }
            int temp = arr[smaller_no];
            arr[smaller_no] = arr[i];
            arr[i] = temp;
        }
    }


    static void bubble(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=1; j< arr.length-i; j++){
                if (arr[j] < arr[j-1]){ 
                    int temp;
                    temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
}
