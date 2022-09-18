package com.example.zmt.arrays;

import java.util.Arrays;

public class MyDynamicArray {
    // we will store our elements in the array
    private String[] array;

    // capacity is the number of elements that our array can hold.
    private int capacity;

    // currentLength is the number of elements currently present in the array.
    private int currentLength;

    public MyDynamicArray() {
        array = new String[1];
        capacity = 1;
        currentLength = 0;
    }

    // get(index) method returns the element of array at the given index.
    public String getCurrentData(int index){
       return this.array[index];
    }

    public void addToMyArray(String item){
        //array at full size, we need to copy all element to a new array
        if(currentLength== capacity){

           this.array = Arrays.copyOf(array,capacity+1);
            // set the newly created array as our real array.
            // update the value of capacity
            capacity +=1;
        }

        // insert the new element at the end
        array[currentLength] = item;
        // update value of currentLength by 1
        currentLength++;

    }

    // remove last element
    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    // delete element at the given index
    public void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                for (int i = index; i < currentLength-1; i++) {
                    array[i] = array[i + 1];
                }
                removeItemFromArray();
                currentLength--;
                capacity--;
            }
        } else {
            System.err.println("Index out of bounds");
        }
    }

    public void removeItemFromArray(){
        //array at full size, we need to copy all element to a new array
        if(currentLength== capacity){

            this.array = Arrays.copyOfRange(array,0,array.length-1);
            // set the newly created array as our real array.
            // update the value of capacity
            capacity--;
        }

        // update value of currentLength by 1
        currentLength--;

    }



    @Override
    public String toString() {
        return "MyDynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", capacity=" + capacity +
                ", currentLength=" + currentLength +
                '}';
    }
}
