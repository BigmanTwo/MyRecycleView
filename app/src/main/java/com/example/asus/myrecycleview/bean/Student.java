package com.example.asus.myrecycleview.bean;

/**
 * Created by Asus on 2016/4/14.
 */
public class Student {
    private int photo;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Student(int photo, String name, int age) {
        this.photo = photo;
        this.name = name;
        this.age = age;
    }
}
