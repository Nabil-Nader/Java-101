package com.example.linkedlist;

import java.util.LinkedList;

public class LinkedListAlgorithm {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Sally");
        list.add("Becky");
        list.add("Nick");
        list.add("Jack");
        list.add("Billy");

        System.out.println(list.contains("Billy"));
        System.out.println(list.contains("billy"));
        System.out.println(list.size());

        list.removeFirst();
        list.forEach(x-> System.out.print(x + "->"));



    }

}
