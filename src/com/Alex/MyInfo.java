package com.Alex;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
        System.out.println("-------------------------------------------");

        // 上界通配符 <? extends T>
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        printIntVal(integerArrayList);

        ArrayList<Float> floatArrayList = new ArrayList<>();
        floatArrayList.add((float) 1.0);
        floatArrayList.add((float) 2.0);
        printIntVal(floatArrayList);

        // 下界通配符 <? super T>
        ArrayList<Number> list = new ArrayList<>();
        // 往集合中添加 Number 类及其子类对象
        list.add(new Integer(1));
        list.add(new Float(1.1));
        // 调用 fillNumList() 方法，传入 ArrayList<Number> 集合
        fillNumList(list);
        System.out.println(list);
        System.out.println("-------------------------------------------");

        // Stream
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 11, 22, 33, 44, 55);
        // 遍历输出符合条件的元素
        list2.stream().filter(x -> x > 6).forEach(System.out::println);
        // 匹配第一个
        Optional<Integer> findFirst = list2.stream().filter(x -> x > 6).findFirst();
        // 匹配任意（适用于并行流）
        Optional<Integer> findAny = list2.parallelStream().filter(x -> x > 6).findAny();
        // 是否包含符合特定条件的元素
        boolean anyMatch = list2.stream().anyMatch(x -> x > 6);
        System.out.println("Match the first number greater than 6：" + findFirst.get());
        System.out.println("Match any number greater than 6：" + findAny.get());
        System.out.println("If it exists the number greater than 6：" + anyMatch);
        System.out.println("-------------------------------------------");

        // WeakHashMap
        WeakHashMap<String, Integer> myWeakHashMap = new WeakHashMap<>();
        String theFirst = "First";
        Integer one = 1;
        String theSecond = "Second";
        Integer two = 2;
        myWeakHashMap.put(theFirst, one);
        myWeakHashMap.put(theSecond, two);
        theSecond = null;
        System.gc();
        System.out.println("WeakHashMap after garbage collection: " + myWeakHashMap);
        System.out.println("-------------------------------------------");

        // NavigableMap
        NavigableMap<String, Integer> numbers1 = new TreeMap<>();
        numbers1.put("Two", 2);
        numbers1.put("One", 1);
        numbers1.put("Three", 3);
        System.out.println("NavigableMap: " + numbers1);
        System.out.println("First Entry: " + numbers1.firstEntry());
        System.out.println("Last Entry: " + numbers1.lastEntry());
        System.out.println("Removed First Entry: " + numbers1.pollFirstEntry());
        System.out.println("Removed Last Entry: " + numbers1.pollLastEntry());
        System.out.println("-------------------------------------------");

        // Creating a treemap with a customized comparator---Reverse order
        TreeMap<String, Integer> numbers2 = new TreeMap<>(new CustomComparator());
        numbers2.put("First", 1);
        numbers2.put("Second", 2);
        numbers2.put("Third", 3);
        numbers2.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers2);
        System.out.println("-------------------------------------------");

        // ConcurrentHashMap
        ConcurrentHashMap<String, Integer> numbers3 = new ConcurrentHashMap<>();
        numbers3.put("One", 1);
        numbers3.put("Two", 2);
        numbers3.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers3);
        // forEach() without transformer function
        numbers3.forEach(4, (k, v) -> System.out.println("key: " + k + " value: " + v));
        // forEach() with transformer function
        System.out.print("Values are ");
        numbers3.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));
        System.out.println("\n");
        System.out.println("-------------------------------------------");

        // HashSet
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);
        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
        System.out.println("-------------------------------------------");

        // Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator2());
        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
        System.out.println("-------------------------------------------");

        // Creating an ArrayList
        ArrayList<Integer> numbers4 = new ArrayList<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(2);
        System.out.println("ArrayList1: " + numbers4);
        // Using frequency to find out the most common element
        int count = Collections.frequency(numbers4, 2);
        System.out.println("Count of 2: " + count);
        // Creating an ArrayList
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);
        // Using disjoint to check whether there exists some common elements
        boolean value = (Collections.disjoint(numbers4, newNumbers));
        System.out.println("Two lists are disjoint: " + value);
        System.out.println("-------------------------------------------");

        // Creating an ArrayList
        ArrayList<Integer> numbers5 = new ArrayList<>();
        numbers5.add(1);
        numbers5.add(3);
        numbers5.add(2);
        System.out.println("ArrayList: " + numbers5);
        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers5.iterator();
        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);
        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);
        System.out.print("Updated ArrayList: ");
        // Using the hasNext() method
        while (iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((v) -> System.out.print(v + ", "));
        }
        System.out.println("\n");
        System.out.println("-------------------------------------------");

        // Reverse array
        int[] arr1 = {10, 20, 30, 40, 50};
        reverseArray(arr1, arr1.length);
        System.out.println("-------------------------------------------");

        // Arraycopy: extended to a large array
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        System.arraycopy(names, 0, extended, 0, names.length);
        extended[3] = "D";
        extended[4] = "E";
        for (String i : extended) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        System.out.println("The names array: " + Arrays.toString(names));
        System.out.println("The extended array: " + Arrays.toString(extended));
        System.out.println("-------------------------------------------");


    }

    // Reverse array
    static void reverseArray(int[] target, int length) {
        int[] newArray = new int[length];
        int newArrayLength = length; // !! Copy length used in the new array
        for (int i = 0; i < length; i++) {
            newArray[newArrayLength - 1] = target[i];
            newArrayLength -= 1;
        }
        System.out.println("The reverse array is: \n");
        // Input reverse array
        for (int i = 0; i < length; i++) {
            System.out.println(newArray[i]);
        }
    }


    // Creating a comparator class
    public static class CustomComparator2 implements Comparator<String> {
        @Override
        public int compare(String animal1, String animal2) {
            int value = animal1.compareTo(animal2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String number1, String number2) {
            int value = number1.compareTo(number2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void fillNumList(ArrayList<? super Number> list) {
        list.add(new Integer(0));
        list.add(new Float(1.0));
    }

    public static void printIntVal(ArrayList<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number.intValue() + " ");
        }
        System.out.println();
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


