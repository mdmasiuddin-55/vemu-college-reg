package com.vemu.college.model;

public class Student {
    private String name;
    private String email;
    private String course;

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // ✅ Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }

    // ✅ Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
