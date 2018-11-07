package com.example.samuellim.testviewpager;

import java.util.ArrayList;

public abstract class User {

    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private ArrayList<ServiceRequest> services;

    public User(String inName, String inPassword, String inFullname, String inPhone){
        this.username = inName;
        this.password = inPassword;
        this.fullName = inFullname;
        this.phoneNumber = inPhone;

    }


    //setter methods for the user
    public void setUsername(String inUsername){
        this.username = inUsername;
    }

    public void setPassword(String inPassword){
        this.password = inPassword;
    }

    public void setFullName(String inFullName){
        this.fullName = inFullName;
    }

    public void setPhoneNumber(String inHP){
        this.phoneNumber = inHP;
    }


    //getter methods for the user
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String toString(){
        return "username: "+getUsername()+"\nfullname: "+getFullName()+"\nPhone Number: "+
                getPhoneNumber();
    }
}
