package com.Alex;

public class Triangle implements Polygon {
    private final int a;
    private final int b;
    private final int c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getArea() {
        double s = (double) (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the polygon is: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.getArea();
        triangle.getPerimeter(3, 4, 5);

    }
}
