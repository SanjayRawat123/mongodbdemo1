/*
 * Author Name:
 * Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.mongo.example.mongodbdemo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentdata")
public class Student {
    private int id;
    private String name;
    private String city;
    private String college;

    public Student() {
    }

    public Student(int id, String name, String city, String college) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCollege() {
        return college;
    }

    public Student setCollege(String college) {
        this.college = college;
        return this;
    }
}
