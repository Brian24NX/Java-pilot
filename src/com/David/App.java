package com.David;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the student management system!");
            System.out.println("Please choose: 1.Log in 2.Sign up 3.Forgot password 4.User info 5.Exit");

            String option = sc.next();

            switch(option) {
                case "1" -> login(list);
                case "2" -> signup(list);
                case "3" -> forgotPassword(list);
                case "4" -> printList(list);
                case "5" -> {
                    System.out.println("Thank you, see you next time!");
                    System.exit(0);
                }
                default -> System.out.println("Oops, there is no such option");
            }
        }


    }

    private static void forgotPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = sc.next();
        Boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("Oops... Current user " + username +" does not exists! Please sign up first.");
            return;
        }
        while (true) {
            System.out.println("Please enter your userID: ");
            String userID = sc.next();
            System.out.println("Please enter your phoneNumber: ");
            String phoneNumber = sc.next();

            int userIndex = findUserIndex(list,username);
            User userCurrent = list.get(userIndex);


            User user = new User(null,null,userID,phoneNumber);
            Boolean result = checkUserIDWithPhoneNumber(userCurrent, user);
            if (result) {
                String newPassword;
                System.out.print("User info matched successfully, ");
                while (true) {
                    System.out.println("Please enter your new password: ");
                    newPassword = sc.next();
                    System.out.println("Please enter your new password again: ");
                    String againPassword = sc.next();
                    if (!againPassword.equals(newPassword)) {
                        System.out.println("Password is not matched, please enter again.");
                        continue;
                    } else {
                        System.out.println("Password matched successfully!");
                        break;
                    }
                }
                userCurrent.setUserPassword(newPassword);
                System.out.println("Password is updating....");
                try {
                    Thread.sleep(3000);  // 3000 milliseconds = 3 seconds
                } catch (InterruptedException e) {
                    // Handle the exception if the sleep is interrupted
                    System.err.println("Sleep was interrupted");
                }
                System.out.println("Password updated successfully!");
                break;
            } else {
                System.out.println("User info can not be matched, please enter again.");
            }
        }

    }

    private static int findUserIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserName().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    private static void signup(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("Please enter your username: ");
            username = sc.next();

            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("Username format is not valid!!!");
                continue;
            }

            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("Current user " + username + " is already existed! Please enter your username again.");
            } else {
                System.out.println("Current user " + username + " is valid.");
                break;
            }
        }
        String password;
        while (true) {
            System.out.println("Please enter your password: ");
            password = sc.next();
            System.out.println("Please enter your password again: ");
            String againPassword = sc.next();
            if (!againPassword.equals(password)) {
                System.out.println("Password is not valid, please enter again.");
                continue;
            } else {
                System.out.println("Password matched successfully!");
                break;
            }
        }
        String id;
        while (true) {
            System.out.println("Please enter your ID number: ");
            id = sc.next();
            boolean flag = checkIdNumber(id);
            if (flag) {
                System.out.println("ID number is valid!!");
                break;
            } else {
                System.out.println("Id number is not valid, please enter again.");
                continue;
            }
        }
        String phoneNumber;
        while (true) {
            System.out.println("Please enter your phone number: ");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("Phone number is valid!!");
                break;
            } else {
                System.out.println("Phone number is not valid, please enter again.");
                continue;
            }
        }

        User u = new User(username, password, id, phoneNumber);
        list.add(u);
        System.out.println("Registered successfully!!");
        printList(list);


    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUserName() + ", " + u.getUserPassword()+ ", " + u.getUserID() + ", " + u.getUserPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIdNumber(String id) {
        if (id.length() != 18) {
            return false;
        }
        if (id.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < id.length()-1; i++) {
            char c = id.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        char endChar = id.charAt(id.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'X') || (endChar == 'x')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String name = user.getUserName();
            if (name.equals(username)) {
                return true;
            }
        }
        return false;

    }

    private static boolean checkUsername(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break; // Stop loop right away once count>0
            }
        }
        return count > 0;

    }

    private static void login(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter username: ");
            String username = sc.next();
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("Username " + username +" haven't enrolled, please sign up first.");
                return;
            }
            System.out.println("Please enter password: ");
            String password = sc.next();

            while (true) {
                String verificationCode = getCode();
                System.out.println("The correct verification code is " + verificationCode);
                System.out.println("Please enter the verification code: ");
                String code = sc.next();
                if (code.equalsIgnoreCase(verificationCode)) {
                    System.out.println("Verified successfully!!");
                    break;
                } else {
                    System.out.println("Verified failed...");
                    continue;
                }
            }

            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("Login successfully!!");
                // This block goes to the Student Management System.
                break;
            } else {
                System.out.println("Login failed, username or password is incorrect.");
                if (i == 2) {
                    System.out.println("Current user account is being locked, please reach out to website admin for account retrieve ");
                    return;
                } else {
                    System.out.println("Current username or password is incorrect, left " + (2-i) + " chances to enter in");
                }
            }

        }

    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserName().equals(userInfo.getUserName()) && user.getUserPassword().equals(userInfo.getUserPassword())) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUserIDWithPhoneNumber(User userCurrent, User user) {
        if (user.getUserID().equalsIgnoreCase(userCurrent.getUserID()) && user.getUserPhoneNumber().equals(userCurrent.getUserPhoneNumber())) {
            return true;
        }
        return false;
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
