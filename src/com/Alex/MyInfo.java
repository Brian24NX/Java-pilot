package com.Alex;

import java.util.*;

/**
 * @author nxzhouj
 */
public class MyInfo {
    private static int i;
    private static double a;
    private static short b;
    private static long c;
    private static float d;
    private static boolean e;
    private static byte f;
    private static char g;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("hi" + g + "I'm Brian");
        System.out.println(i);

        int a = 173;
        System.out.println(a + "!!!!");
        String b = String.valueOf(a);
        System.out.println(b);

        int[] arr = {34, 64, 87, 878, 12, 96};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] / 10 % 10 != 7 && arr[i] % 10 != 7) {
                sum += arr[i];
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("-------------------------------------------");

        int[] arr2 = {19, 28, 37, 46, 50};

        System.out.println("Please type in target number: ");
        Scanner target = new Scanner(System.in);
        int myTarget = target.nextInt();
        int myIndex = getIndex(arr2, myTarget);
        System.out.println("The target index is: " + myIndex);

        System.out.println("-------------------------------------------");

        int[] arr3 = {19, 28, 37, 46, 50};
        reverse(arr3);
        printArray(arr3);

        System.out.println("-------------------------------------------");

        int first = 1;
        int second = 2;
        swap(first, second);

        System.out.println("-------------------------------------------");

        // iterator --- one way iteration
        ArrayList<String> goat = new ArrayList<>();
        goat.add("Lebron James");
        goat.add("Kobe Bryant");
        goat.add("Micheal Jordan");

        Iterator<String> it = goat.iterator();
        System.out.println(it.next());

        System.out.println("-------------------------------------------");

        // arrayCopy - Shallow copy
        int[] nums = {1, 2, 3, 4, 5};
        int[] copyNums = nums;

        nums[0] = -1; // change nums
        for (int i : copyNums) {
            System.out.println(i + ", "); // print copyNums
        }
        // -1,2,3,4,5
        // It's because both arrays refer to the same array object
        System.out.println("-------------------------------------------");

        // arrayCopy - Deep copy
        int[] numbers = {23, 24, 25, 26, 27};
        int[] copyNumbers = new int[5];

        // iterate and copy elements from numbers to copyNumbers
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        // converting array to string
        System.out.println(Arrays.toString(copyNumbers));
        System.out.println("-------------------------------------------");

        int[] n1 = {1, 3, 5, 7, 9};
        int[] n2 = new int[n1.length];

        // arraycopy()
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copyOfRange
        int[] n3 = Arrays.copyOfRange(n1, 0, n1.length - 1);
        System.out.println("n3 = " + Arrays.toString(n3));
        System.out.println("-------------------------------------------");

        String string = "Brian";
        // Using stringBuffer
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("Before: " + string);
        System.out.println("After: " + reverse);
        System.out.println("-------------------------------------------");

        // StringTokenizer
        String str = "JAVA, Python, C++, Dart, Golang";
        StringTokenizer strTokenizer = new StringTokenizer(str, ", ");
        while (strTokenizer.hasMoreTokens()) {
            System.out.println(strTokenizer.nextToken());
        }
        System.out.println("-------------------------------------------");

        // Simple recursion example
        int num = 4;
        int result = factorial(num);
        System.out.println("The factorial of 4 is " + result);
        System.out.println("-------------------------------------------");

        // primitive variables
        int abc = 1;
        double xyz = 1.0;
        // convert primitive to wrapper objects, using valueOf()
        Integer obj1 = Integer.valueOf(abc);
        Double obj2 = Double.valueOf(xyz);
        /* auto-boxing
         Integer obj1 = abc;
         Double obj2 = xyz;
         */

        if (obj1 instanceof Integer) {
            System.out.println("An object of Integer is created. ");
        }
        if (obj2 instanceof Double) {
            System.out.println("An object of Double is created. ");
        }


    }

    public static int getIndex(int[] arr2, int myTarget) {
        int indexNum = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == myTarget) {
                indexNum = i;
                break;
            }
        }
        return indexNum;
    }

    public static void reverse(int[] arr3) {
        for (int i = 0, j = arr3.length - 1; i <= j; i++, j--) {
            int temp = arr3[i];
            arr3[i] = arr3[j];
            arr3[j] = temp;
        }
    }

    public static void printArray(int[] arr3) {
        System.out.print("The reversed array is [ ");
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println(" ]");
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: first = " + a + ", second = " + b);
    }

    public static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

}


