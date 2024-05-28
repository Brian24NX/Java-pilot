package com.Catherine;

import java.util.Random;

public class StringTask {
    public static void main(String[] args) {
        System.out.println("-------------");
        String str = "Brian";
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            System.out.print(chars); // Using double quote
            if (i < str.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
        System.out.println("-------------");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("def").append("ghi");
        System.out.println(stringBuilder); // abcdefghi

        String strToString = stringBuilder.toString();
        System.out.println(strToString); // abcdefghi

        System.out.println("-------------");

        char[] charArr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < str.length(); i++) {
            int randomIndex = r.nextInt(str.length());
            charArr[randomIndex] = str.charAt(i);
        }
        String result = new String(charArr);
        System.out.println(result);

        System.out.println("-------------");

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

        char[] chars1 = code.toCharArray();
        int randomIndex = random.nextInt(chars1.length - 1);

        char temp = chars1[randomIndex];
        chars1[randomIndex] = chars1[chars1.length - 1];
        chars1[chars1.length - 1] = temp;

        String res = new String(chars1);
        System.out.println(res);

        System.out.println("-------------");

        String strNum = "12345";
        int num = Integer.parseInt(strNum); // API
        System.out.println("Using API: " + num);
        System.out.println("Using manual: " + stringToNumber(strNum));

        System.out.println("-------------");

        String s = "hello world";
        int times = 0;
        for (int i = s.length()-1; i > 0; i--) {
            if (s.charAt(i) != ' ') {
                times += 1;
            } else {
                break;
            }

        }

        System.out.println(times);




















    }

    public static int stringToNumber(String str) {
        int reuslt = 0;
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            int digitNum = digit - '0';  // ex: '1' - '0'
            reuslt = reuslt * 10 + digitNum;
        }
        return reuslt;

    }

}