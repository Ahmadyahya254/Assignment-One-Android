package com.example.assignmentoneandroid;

import java.util.Objects;

public class Assignment {  // Pojo Class
    private String name;

    public Assignment() {
    }

    public Assignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}