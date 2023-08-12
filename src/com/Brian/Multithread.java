package com.Brian;

/**
 * @author nxzhouj
 */
public class Multithread extends Thread {
    private final String name;

    public Multithread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + " is running: " + i);
            try {
                // Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

