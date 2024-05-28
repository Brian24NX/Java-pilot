package com.Catherine;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyFaces = {"Handsome", "Cute", "Masculine", "Robust", "Raffish"};
    String[] girlFaces = {"Gorgeous", "Beautiful", "Plain-jane", "Disgusting", "Coquettish"};

    public Role() {

    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == 'M') {
            int indexMale = r.nextInt(boyFaces.length);
            this.face = boyFaces[indexMale];
        } else if (gender == 'F') {
            int indexFemale = r.nextInt(girlFaces.length);
            this.face = girlFaces[indexFemale];
        } else {
            this.face = "Hideous";
        }

    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + " punches " + role.getName() + " and incur " + hurt + " injuries, " + role.getName() + " left " + remainBlood + " bloods");

    }

    public void showRoleInfo() {
        System.out.println("Name：" + getName());
        System.out.println("Blood：" + getBlood());
        System.out.println("Gender：" + getGender());
        System.out.println("Face：" + getFace());
    }


}
