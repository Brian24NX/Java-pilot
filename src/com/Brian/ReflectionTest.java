package com.Brian;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
    // Summary
    // 1. Dynamically load Class
    // 2. Get info through object of the Class
    public static void main(String[] args) {
        try {
            // create an object of Reflection
            Reflection example = new Reflection();
            // create an object of Class using getClass()
            Class<? extends Reflection> obj = example.getClass();
            // get name of the class
            String name = obj.getName();
            System.out.println("Name of Class: " + name);
            // get the access modifier of the class
            int modifier = obj.getModifiers();
            // convert the access modifier to string
            String strModifier = Modifier.toString(modifier);
            System.out.println("Modifier of Class: " + strModifier);
            System.out.println("----------------------------------");

            // using object of Class to get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();
            // create an object of the Method class
            for (Method m : methods) {
                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier2 = m.getModifiers();
                // convert the access modifier to string
                System.out.println("Modifier: " + Modifier.toString(modifier2));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }
            System.out.println("----------------------------------");

            // access the private field color
            Field field1 = obj.getDeclaredField("Color");
            // allow modification of the private field
            field1.setAccessible(true);
            // set the value of color
            field1.set(example,"Brown");
            // get the value of field color
            String colorValue = (String) field1.get(example);
            System.out.println("Value: " + colorValue);

            // get the access modifier of color
            int mod2 = field1.getModifiers();

            // convert the access modifier to string
            String modifier3 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier3);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
