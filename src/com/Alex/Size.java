package com.Alex;

public enum Size {
    SMALL("This is small"),
    MEDIUM("This is medium"),
    LARGE("THis is large");

    private final String pizzaSize;
    Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
}

class MainSize {
    public static void main (String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getPizzaSize());
    }
}

