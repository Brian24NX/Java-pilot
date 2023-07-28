package com.Alex;

public class GenericsTest {
    public static void main(String[] args) {

        Generics<String> firstObj = new Generics<>("Hello world");
        Generics<Integer> secondObj = new Generics<>(24);
        System.out.println("String object is " + firstObj.getData());
        System.out.println("Integer object is " + secondObj.getData());

    }

}
