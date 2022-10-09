package com.example;

public class Main {

    public static void main(String[] args) {

        String st = " hello       world    =";
        System.out.println(st);

        st = st.replaceAll("\\s+$", "");
        System.out.println(st);


    }
}


/*
 * we Can model Physical Objects in code with classes
 *
 *  Class /blueprint
 *      a blueprint containing a
 *  set of attributes and behaviors that define an object
 *
 *
 *
 *
 */
