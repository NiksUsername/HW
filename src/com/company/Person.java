package com.company;

public class Person {
    int age;
    String name;

    public String post() {
        return "None";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + age + ")";
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {}
}
