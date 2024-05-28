package com.Catherine;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + " years old " + getColor() + " cat is eating " + something);
    }

    public void catchMouse() {
        System.out.println("Cat is catching mouse");
    }




}
