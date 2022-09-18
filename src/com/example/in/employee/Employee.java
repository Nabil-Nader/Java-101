package com.example.in.employee;

public class Employee {

    String name ;
    String location ;
    double salary ;
    int age;

    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }


    public void raiseSalary(){
        this.salary = this.salary *1.2 ;
    }






}
