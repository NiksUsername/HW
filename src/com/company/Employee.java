package com.company;

public class Employee extends Person{
    String company;

    @Override
    public String post() {
        return "Manager";
    }

    public Employee(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + age + ", " + company + ')';
    }

    public Employee() {}
}
