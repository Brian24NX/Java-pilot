package com.Brian;

/**
 * @author nxzhouj
 */
public class Account {
    public String account;
    public double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double money) {
        // t1和t2并发这个方法。。。。（t1和t2是两个栈。两个栈操作堆中同一个对象。）
        // 取款之前的余额
        double before = this.getBalance();
        // 取款之后的余额
        double after = before - money;
        // 模拟一下网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更新余额
        // t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。
        // 此时一定出问题，因此使用t1.join（）！！
        this.setBalance(after);
    }

}

