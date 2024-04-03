package com.mrwantesting.model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private boolean gender;
    private int age;
    private Date birthDate;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, boolean gender, Date birthDate, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}





