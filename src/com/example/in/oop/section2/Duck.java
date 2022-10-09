package com.example.in.oop.section2;

public class Duck {
    //member variable : data

    private  String name;
    private int lifExpectation;
    private String favouriteFood;

    public Duck(String name, int lifExpectation, String favouriteFood) {
        this.name = name;
        this.lifExpectation = lifExpectation;
        this.favouriteFood = favouriteFood;
    }

    //method
    void waddle(){
        System.out.println("waddle waddle");
    }

    void quack(){
        System.out.println("quack quack");
    }
}
