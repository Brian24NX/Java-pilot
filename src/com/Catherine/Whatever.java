package com.Catherine;

import java.util.Random;
import java.util.Scanner;

public class Whatever {
    public static void main(String[] args) {
        // comments
        System.out.println("Hello world");
        System.out.println('a');
        // tabs
        System.out.println("name" + "\t" + "age");
        System.out.println("Brian" + "\t" + "23");
        // assignments
        int count = 0;
        count += 1;
        count = count + 1 - 2 + 2 - 2 + 1;
        System.out.println(count);
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop ended.");
        // continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        /*
            Scanner sc = new Scanner(System.in);
            System.out.print("Pls enter the number: ");
            int i = sc.nextInt();
            System.out.println(i);
        */
        // byte + byte = int, but now we want result to be byte
        byte a = 10;
        byte b = 20;
        byte res1 = (byte) (a + b);
        System.out.println("After unbox: " + res1);
        // a+=b ----> a = a+b
        boolean res2 = a < b;
        System.out.println("T or F: " + res2);
        // ^
        System.out.println(true ^ false);
        // &&
        int num1 = 10;
        int num2 = 10;
        boolean res3 = ++num1 < 10 && ++num2 < 10;
        System.out.println(res3);
        System.out.println(num1);
        System.out.println(num2);
        // number 6 // ternary operator
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Pls enter the number: ");
//        int i = sc.nextInt();
//        System.out.println(i);
//        int h = sc.nextInt();
//        System.out.println(h);
//        boolean res4 = (i == 6 | h == 6) || ((i + h) % 6 == 0);
//        System.out.println(res4);
//        System.out.println(i == h ? true : false);
        // & ,|
        int k = 100;
        int n = 99;
        System.out.println(k | n);
        // counts
        int counts = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                counts++;
            }
        }
        System.out.println(counts);
        // Palindromic number
        // Set integer object
        int pal = 123321;
        // Record temp for integer object
        int temp = pal;
        // Record target number after transform integer object
        int target = 0;
        while (pal != 0) {
            int RightDigit = pal % 10; // Digit moved from right to left
            pal = pal / 10; // Update integer object
            target = target * 10 + RightDigit; // Combine each other to generate target number
        }
        boolean res = temp == target;
        System.out.println("Is it a palindromic number? " + res);
        // Pass number 7
//        Scanner number = new Scanner(System.in);
//        System.out.println("Please enter the number");
//        int obj = number.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("Pass");
                continue;
            }
            System.out.println(i);
        }
        // Prime number or composite number
        int example = 23;
        boolean resultOfNumber = true; // mark switch
        for (int i = 2; i <= example - 1; i++) {
            if (example % i == 0) {
                resultOfNumber = false;
                break;
            }
        }
        if (resultOfNumber) {
            System.out.println("The example is a prime number");
        } else {
            System.out.println("The example is a composite number");
        }

        /* Generate 10 diff random numbers from 1~100 and stored in an array, then calculate how
        many random numbers are smaller than the average */
        int[] arrayRandom= new int[10];

        int sums = 0;
        Random rand = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            int randNum = rand.nextInt(100) +1; // from 1 to 100
            arrayRandom[i] = randNum;
            System.out.print(arrayRandom[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayRandom.length; i++) {
            sums += arrayRandom[i];
        }
        System.out.println("The sum is " + sums);
        int average = sums / arrayRandom.length;
        System.out.println("The average is " + average);

        int amountsOfSmallerThanAverage = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] < average) {
                System.out.println(arrayRandom[i] + " < " + average);
                amountsOfSmallerThanAverage++;
            }
        }
        System.out.println("Total random numbers are smaller than the average is " + amountsOfSmallerThanAverage);

        // CopyOfRange
        int[] arr = {12, 34, 45, 3, 56, 88, 99, 1};
        int[] newCopy = copyOfRange(arr, 3, 7);
        for (int i = 0; i <newCopy.length ; i++) {
            System.out.print(newCopy[i] + " ");
        }
        System.out.println();

        // Calculate how many prime numbers between 101 and 200, and counts
        int countPrime = 0;

        for (int i = 101; i <201 ; i++) {
            boolean flagPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flagPrime = false;
                    break;
                }
            }
            if (flagPrime) {
                System.out.println("The number of " + i + " is a prime number" );
                countPrime++;
            }
        }
        System.out.println("The total prime numbers are " + countPrime);

        // Verification code
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                chars[i] = (char) (96 + i);
            } else {
                chars[i] = (char) (65 + i - 26);
            }
        }
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(chars.length);
            code += chars[randomIndex];
        }
        int randomNumber = random.nextInt(10);
        code += randomNumber;
        System.out.println(code);

        // Transfer int 12345 to int[1,2,3,4,5]
        int numTest = 12345;
        int tempNum = numTest;
        int numDigit = 0;
        while (numTest != 0) {
            numTest /= 10; // Sliding from right to left
            numDigit++;
        }

        int[] numArray = new int[numDigit];
        int index = numArray.length - 1;
        while (tempNum != 0) {
            int Digit = tempNum % 10; // Find every digit
            tempNum /= 10;// Sliding from right to left
            numArray[index] = Digit;
            index--;
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();

        int[] arrOfPrize = {2, 588, 888, 1000, 10000};
        int[] newArrOfPrize = new int[arrOfPrize.length];
        Random r = new Random();
        for (int i = 0; i <5 ;) {
            int randomIndex = r.nextInt(arrOfPrize.length);
            int targetPrize = arrOfPrize[randomIndex];
            boolean flag = contains(newArrOfPrize, targetPrize);
            if (!flag) {
                newArrOfPrize[i] = targetPrize;
                i++;
            }
        }
        for (int i = 0; i < newArrOfPrize.length ; i++) {
            System.out.print(newArrOfPrize[i] +" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");


        System.out.println(mystery(2,25)); // 50
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(i + ": " + F(i));
//        }

        int[] arrTest = {2, 3, 4, 10, 40};
        int targetTest = 10;

        // Using iterative binary search
        int result = binarySearch(arrTest, targetTest);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else
            System.out.println("Element not found");

        // Using recursive binary search
        result = binarySearchRecursive(arrTest, targetTest, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else
            System.out.println("Element not found");
        System.out.println("--------------------------------------------------------");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Pls enter the String: ");
//        String str = sc.next();

//        int maxCounts = 0;
//        int minCounts = 0;
//        int numCounts = 0;
//        int othersCounts = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                minCounts++;
//            } else if (c >= 'A' && c <= 'Z') {
//                maxCounts++;
//            } else if (c >='0' && c <= '9') {
//                numCounts++;
//            } else {
//                othersCounts++;
//            }
//        }
//        System.out.println(minCounts + " " +maxCounts + " " + numCounts + " " + othersCounts);

        String testStr = reverse("Brian");
        System.out.println(testStr);

//        Scanner sc = new Scanner(System.in);
//        int num; // For accessing
//        while (true) {
//            System.out.print("Pls enter the number: ");
//            num = sc.nextInt();
//            if (num >= 0 && num <= 9999999) {
//                break;
//            } else {
//                System.out.println("Error");
//            }
//        }
//        System.out.println("Legal money: " + num);
//        System.out.println("--------------------------------------------------------");

        char[] chars2 = {'a', 'b', 'c', 'd'};
        byte[] bytes = {97, 98, 99,100};
        String toString = new String(chars2);
        String toString2 = new String(bytes);
        System.out.println(toString);
        System.out.println(toString2);



















    }

    public static String reverse(String str) {
        String s = "";
        for (int i = str.length()-1; i >=0; i--) {
            char c = str.charAt(i);
            s += c;
        }
        return s;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;
                // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle
            if (arr[mid] == target)
                return mid;

            // If the element is smaller than mid, then it's in the left subarray
            if (arr[mid] > target)
                return binarySearchRecursive(arr, target, left, mid - 1);

            // Else the element can only be present in the right subarray
            return binarySearchRecursive(arr, target, mid + 1, right);
        }

        // We reach here if the element is not present in the array
        return -1;
    }

    public static long F(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return F(n - 1) + F(n - 2);
    }


    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a; // mystery(2,25) ==> 2 + 16 + 32 = 50

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i <to ; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }


}
