package com.Brian;

public class Employee {
    String name;
    int age;
    int salary;
    String position;

    public void employeeName(String name) {
        this.name = name;
    }

    public void employeeAge(int age) {
        this.age = age;
    }

    public void employeeSalary(int salary) {
        this.salary = salary;
    }

    public void employeePosition(String position) {
        this.position = position;
    }

    public void employeeInfo() {
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
        System.out.println("Salary: " + salary );
        System.out.println("Position: " + position );
    }

}

