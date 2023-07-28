package com.Alex;

interface Polygon {
    void getArea();

    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        System.out.println("The perimeter of the polygon is: " + perimeter);
    }
}
