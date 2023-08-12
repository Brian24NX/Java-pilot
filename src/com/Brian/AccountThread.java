package com.Brian;

/**
 * @author nxzhouj
 */
public class AccountThread extends Thread {
    // 两个线程必须共享同一个账户对象。
    public Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        // run方法开始执行操作
        double money = 5000;
        // 取款5000，多线程并发执行这个方法
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + " Account: " +
                act.getAccount() + " | " + "Withdraw: " + money + " | " + "Balance: " + act.getBalance());
    }

}
