package com.zoho;

public class User {
    String userName;
    String password;

    User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    @Override
    public String toString() {
        return userName;
    }
}
