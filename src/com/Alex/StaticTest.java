package com.Alex;

public class StaticTest {
    private static int staticInt = 2;
    private int random = 2;

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest test2 = new StaticTest();
    }
}

/*  staticInt = 3  random = 3
    staticInt = 4  random = 3
    static method shares the copy of object but non-static method not

 */
