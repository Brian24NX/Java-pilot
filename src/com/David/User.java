package com.David;

public class User {
    private String userName;
    private String userPassword;
    private String userID;
    private String userPhoneNumber;

    public User() {
    }

    public User(String userName, String userPassword, String userID, String userPhoneNumber) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userID = userID;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
