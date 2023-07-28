package com.Alex;

public class GenericInterfaceTest {
    public static void main(String[] argus) {
        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        GenericInterface<String> reverse = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        GenericInterface<Integer> factorial = (num) -> {
            int res = 1;
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println("The factorial of 5 = " + factorial.func(5));



    }
}
