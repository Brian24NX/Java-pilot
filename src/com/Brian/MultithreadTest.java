package com.Brian;

/**
 * @author nxzhouj
 */
public class MultithreadTest {
    public static void main(String[] args) {
        Thread t1 = new Multithread("A");
        Thread t2 = new Multithread("B");
        // Thread => Runnable
        t1.start(); // Executing, only once, not repeated
        t2.start();
        // 多线程程序是乱序执行
    }

}
