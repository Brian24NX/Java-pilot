package com.Brian;

/**
 * @author nxzhouj
 */
public class AccountTest {
    public static void main(String[] argus) {
        // Create an object of Account
        Account myAccount = new Account("China Bank", 10000);
        // Create thread
        Thread t1 = new AccountThread(myAccount);
        Thread t2 = new AccountThread(myAccount);

        t1.setName("Brian");
        t2.setName("Alex");

        t1.start();
        try {
            t1.join();// Waiting t1 thread finished before going to the next thread

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();


    }
}
