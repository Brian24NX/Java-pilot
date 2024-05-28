package com.David;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }


    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4 ; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);

        }

        int num = r.nextInt(10);
        sb.append(num);

        char[] charArr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(charArr.length);
        int lastIndex = charArr.length - 1;
        char temp = charArr[randomIndex];
        charArr[randomIndex] = charArr[lastIndex];
        charArr[lastIndex] = temp;


        return new String(charArr);




    }









}
