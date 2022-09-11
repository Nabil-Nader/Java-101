package com.example.questions;

import java.util.Arrays;

public class ArrayAlgorithms {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void rotateArrayLeft(int [] arr){

        int indexZero = arr[0];
        //put 2 at index 0 and so on
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length-1] = indexZero;
    }


}
