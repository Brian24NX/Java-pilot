package com.Catherine;

public class AnimalTest {
    public static void main(String[] args) {

        Person jason = new Person("Jason", 22);
        Dog d = new Dog(2, "black");
        Cat c = new Cat(3, "red");
        jason.feedPet(d, "bone");
        jason.feedPet(c, "fish");


    }

    }



