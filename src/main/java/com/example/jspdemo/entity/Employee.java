package com.example.jspdemo.entity;

public class Employee {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("初始化Employee对象");
    }

    public void destroy(){
        System.out.println("销毁Employee对象");
    }
}
