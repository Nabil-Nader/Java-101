package com.example.questions;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayChallange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        findMaxNumberOfArray(arr);
        findMaxNumberOfTwoNumber(arr);
    }

    public static void findMaxNumberOfArray(int[] input) {
        int maxNumber = input[0];
        for (int i : input) {
            if (maxNumber < i) {
                maxNumber = i;
            }
        }


        System.out.println("Max number in the array is " + maxNumber);
    }
    // max protract of 2 number
    // time comicality o(N)^2

    public static void findMaxNumberOfTwoNumber(int[] input) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] * input[j] > max) {
                    max = input[i] * input[j];
                }
            }
        }

        System.out.println("Max number in the array is " + max);


    }


    //  quick sort worst case N2-> we need to write algorithms  with ON time or liner time
    /*
        Inst ead of using built-in array.sort
        you could discuss converting the input to use integer object
        so that merge sort is run
     */
    public static void findMaxNumberWithSortedArray(int [] arr){

        int length = arr.length;
        Arrays.sort(arr);
        int maxProduct = arr[length-2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if(maxProduct > minProduct){
            System.out.println("Max number:"+maxProduct);
        }else{
            System.out.println("Max number:"+minProduct );

        }
    }


}
