package com.Brian;

/**
 * 建立一个公共动物父类
 *
 * @author nxzhouj
 */
public class Animal {
    private final String type;
    private final String name;
    private final int id;

    /*由于name和id都是私有的，所以子类不能直接继承，
    需要通过有参构造函数进行继承*/
    public Animal(String myType, String myName, int myId) {
        this.type = myType;
        this.name = myName;
        this.id = myId;
    }

    private String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void introduction() {
        System.out.println("Hello I'm number " + id + " " + name);
    }

    // Inner class AnimalAction
    class AnimalAction {
        String actionType;

        void setActionType() {
            if (Animal.this.type.equals("carnivore")) {
                if (Animal.this.getName().equals("Tiger")) {
                    this.actionType = "ferocious";
                } else {
                    this.actionType = "meek";
                }
            } else {
                this.actionType = "meek";
            }
        }
        String getActionType() {
            return this.actionType;
        }

    }


}

