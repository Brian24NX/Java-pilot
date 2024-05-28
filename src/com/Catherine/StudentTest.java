package com.Catherine;


public class StudentTest {

    public static void main(String[] args) {

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "Alex", 23);
        Student stu2 = new Student(2, "Brian", 24);
//        Student stu3 = new Student(3, "Catherine", 25);

        arr[0] = stu1;
        arr[1] = stu2;
//        arr[2] = stu3;

        Student stu4 = new Student(4, "David", 26);

        Boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("Student ID existed!");
        } else {
            int counts = getCounts(arr);
            if (counts == arr.length) {
                Student[] newArr = getNewArr(arr);
                newArr[counts] = stu4;
                printArr(newArr);
            } else {
                arr[counts] = stu4;
                printArr(arr);
            }
        }
    }


    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (arr != null) {
                System.out.println("Name: " + stu.getName() + " , " + "ID: " + stu.getId() + " , " + "Age: " + stu.getAge());
            }
        }


    }

    public static Student[] getNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }



    public static int getCounts(Student[] arr) {
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                counts++;
            }
        }
        return counts;
    }


    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }


}
