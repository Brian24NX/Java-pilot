package com.Alex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MaxHeight {

    public static void main(String[] args) {
        int Alex = 187;
        int Brian = 203;
        int Cathy = 168;

        // Temp Var
        int Temp = (Alex > Brian) ? Alex : Brian;
        int TallestGuy = (Cathy > Temp) ? Cathy : Temp;

        System.out.println("The tallest guy is " + TallestGuy + " cm!!");

        System.out.println("-------------------------------------------");

        for (int i = 100; i < 1000; i++) {
            // Extract each digit
            int tensDigit = i % 10;
            int hundredsDigit = i / 10 % 10;
            int thousandsDigit = i / 10 / 10 % 10;

            if (tensDigit * tensDigit * tensDigit + hundredsDigit * hundredsDigit * hundredsDigit + thousandsDigit * thousandsDigit * thousandsDigit == i) {
                System.out.println("The number is: " + i);
            }
        }
        System.out.println("-------------------------------------------");

        int counts = 0;
        int mountainHeight = 884400000;
        double paperThick = 0.1;

        while (paperThick < mountainHeight) {
            paperThick *= 2;
            counts++;
        }
        System.out.println("The thickness of paper is: " + counts);

        System.out.println("-------------------------------------------");

        Random num = new Random();
        int randomNum = num.nextInt(100) + 1;
        System.out.println(randomNum);

        System.out.print("Please type in number: ");
        while (true) {
            Scanner guess = new Scanner(System.in);
            int guessNum = guess.nextInt();

            if (guessNum > randomNum) {
                System.out.println("A little bit larger...");
            } else if (guessNum < randomNum) {
                System.out.println("Oh, almost got there...");
            } else {
                System.out.println("You got it!");
                break;
            }
        }
        System.out.println("-------------------------------------------");

        int[] arr = {34, 12, 5, 78, 100, 72};
        int maxNum = getMax(arr);
        System.out.println("The largest number in array is " + maxNum);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(53);
        myArr.add(26);
        myArr.add(78);
        myArr.add(32);
        myArr.add(100);

        Collections.sort(myArr);

        for (int i : myArr) {
            System.out.println(i + " ");
        }

        System.out.println("-------------------------------------------");

        double[] arrScore = new double[6];
        Scanner eachScore = new Scanner(System.in);
        for (int i = 0; i < arrScore.length; i++) {
            System.out.print("Please type in the " + (i + 1) + "st judge's point: ");
            arrScore[i] = eachScore.nextDouble();
        }
        printArray(arrScore);
        double maxScore = getMaxScore(arrScore);
        double minScore = getMinScore(arrScore);
        double sumScore = getSumScore(arrScore);
        double finalScore = (sumScore - maxScore - minScore) / (arrScore.length - 2);
        System.out.println("The player's final score is: " + finalScore);


    }

    public static int getMax(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void printArray(double[] arrScore) {
        System.out.print("The player's each score is: [ ");
        for (int i = 0; i < arrScore.length; i++) {
            if (i == arrScore.length - 1) {
                System.out.print(arrScore[i]);
            } else {
                System.out.print(arrScore[i] + ", ");
            }
        }
        System.out.println(" ]");
    }

    public static double getMaxScore(double[] arrScore) {
        double max = arrScore[0];
        for (int i = 0; i < arrScore.length; i++) {
            if (arrScore[i] > max) {
                max = arrScore[i];
            }
        }
        return max;
    }

    public static double getMinScore(double[] arrScore) {
        double Min = arrScore[0];
        for (int i = 0; i < arrScore.length; i++) {
            if (arrScore[i] < Min) {
                Min = arrScore[i];
            }
        }
        return Min;
    }

    public static double getSumScore(double[] arrScore) {
        double sum = 0;
        for (int i = 0; i < arrScore.length; i++) {
            sum += arrScore[i];
        }
        return sum;
    }


}