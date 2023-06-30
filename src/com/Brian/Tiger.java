package com.Brian;

/**
 * @author nxzhouj
 */
public class Tiger extends Animal {
    public Tiger(String myName, int myId) {
        super(myName, myId);
    }
    @Override
    public void eat () {
        System.out.println("This is super method");
    }

    //Self method
    public void aaa() {
        System.out.println("This is my method ");
    }
}
