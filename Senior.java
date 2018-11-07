package com.example.samuellim.testviewpager;


public class Senior extends User {

    String address;

    public Senior(String inUsername, String inPassword, String inFullname,
                       String inPhone, String inAddress){
        super(inUsername, inPassword, inFullname, inPhone);
        this.address = inAddress;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }




}
