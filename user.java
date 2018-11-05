package com.example.samuellim.testviewpager;

public abstract class User {

    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;

    public void User(){
        username = "";
        password = "";
        fullName = "";
        phoneNumber = "";
    }


    //setter methods for the user
    public void setUsername(String inUsername){
        username = inUsername;
    }

    public void setPassword(String inPassword){
        password = inPassword;
    }

    public void setFullName(String inFullName){
        fullName = inFullName;
    }

    public void setPhoneNumber(String inHP){
        phoneNumber = inHP;
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
