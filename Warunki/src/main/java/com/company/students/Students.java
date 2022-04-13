package com.company.students;

public class Students {
    String name;
    String secondName;
    Integer age;

    Students(String  name,String secondName,Integer age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }
    public String hiStudent() {
        return name +" "+ secondName;
    }

}
