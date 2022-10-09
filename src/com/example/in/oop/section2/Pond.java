package com.example.in.oop.section2;

public class Pond {
    public static void main(String[] args) {

        Duck mobyDuck = new Duck("moby",90/3,"celery");
        Duck wolfgangDuck = new Duck("wolfgang",60/3,"meat");

        mobyDuck.quack();
        mobyDuck.waddle();
    }
}
