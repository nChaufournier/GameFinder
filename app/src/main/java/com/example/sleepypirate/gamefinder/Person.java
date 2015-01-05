package com.example.sleepypirate.gamefinder;

/**
 * Created by roger on 1/4/2015.
 */
public class Person {
    String name;
    String age;
    String sex;
    int id;

    public Person(String name, String age, String sex, int id) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
