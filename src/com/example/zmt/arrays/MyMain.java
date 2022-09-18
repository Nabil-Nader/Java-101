package com.example.zmt.arrays;

public class MyMain {
    public static void main(String[] args) {

        MyDynamicArray myDynamicArray = new MyDynamicArray();
        myDynamicArray.addToMyArray("one");
        myDynamicArray.addToMyArray("two");
        myDynamicArray.addToMyArray("three");
        myDynamicArray.addToMyArray("four");
        myDynamicArray.addToMyArray("five");
        myDynamicArray.addToMyArray("six");
        System.out.println(myDynamicArray.toString());
//        myDynamicArray.removeItemFromArray();
//        myDynamicArray.removeItemFromArray();
        myDynamicArray.delete(4);
        System.out.println(myDynamicArray.toString());

    }
}
