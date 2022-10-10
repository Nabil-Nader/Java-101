package com.example.zmt.hash;

public class HashMain {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable<>(2);
        hashTable.setHashData("Billy",10);
        hashTable.setHashData("Nader",10);
        hashTable.setHashData("who",10);
        hashTable.setHashData("doctor",10);

        //[HashEntity{key='Billy', value=10}, HashEntity{key='doctor', value=10}]

        System.out.println("value for key Billy: " + hashTable.getHashData("Billy"));


    }
}
