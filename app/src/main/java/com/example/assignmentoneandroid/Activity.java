package com.example.assignmentoneandroid;

public class Activity {
    private String name;

    public static final Activity[] activities = {
            new Activity("Projects & Assignments"),
            new Activity("Programming Language Learning"),
    };

    public Activity() {
    }

    public Activity(String name) {
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
