package com.example.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("e1","Eg",1000,28);
        Employee e2 = new Employee("e2","ca",1000,20);


        e1.raiseSalary();
        System.out.println(e1.salary);
        System.out.println(e2.salary);

    }

}
