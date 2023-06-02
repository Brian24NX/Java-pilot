package com.Alex;

import java.util.Scanner;

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

}


