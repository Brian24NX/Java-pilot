package com.Catherine;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feedPet(Animal a, String something) {

        if (a instanceof Dog d) {
            System.out.println(age + " years old " + name + " has a " + d.getAge() + " years old "  + d.getColor() + " dog");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println(age + " years old " + name + " has a " + c.getAge() + " years old "  + c.getColor() + " cat");
            c.eat(something);
        } else {
            System.out.println("There is no such animal");
        }


    }

}
