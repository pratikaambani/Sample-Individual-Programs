package com.practise.oops.encapsulation;


public class EncapBean {

    private String name;
    private String idNum;
    private int age;

    protected int getAge() {
        return age;
    }

    //default
    void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getIdNum() {
        return idNum;
    }

    //protected
    protected void setIdNum(String newId) {
        idNum = newId;
    }
}