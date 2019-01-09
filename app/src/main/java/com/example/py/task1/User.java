package com.example.py.task1;

public class User {
    private String name;
    private String occup;
    private String age;

    public User() {
    }

    public User(String name, String occup, String age) {
        this.name = name;
        this.occup = occup;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public String getOccup() {
        return occup;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
