package com.Catherine;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age,color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + " years old " + getColor() + " dog is eating " + something);
    }
    public void LookHome(){
        System.out.println("Dog is watching home");
    }
}
