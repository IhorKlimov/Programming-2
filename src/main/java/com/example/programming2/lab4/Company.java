package com.example.programming2.lab4;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable {
    private String title;
    private Employee director;
    private List<Department> departments;

    public Company(String title, Employee director, List<Department> departments) {
        this.title = title;
        this.director = director;
        this.departments = departments;
    }

    public String getTitle() {
        return title;
    }

    public Company setTitle(String title) {
        this.title = title;
        return this;
    }

    public Employee getDirector() {
        return director;
    }

    public Company setDirector(Employee director) {
        this.director = director;
        return this;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Company setDepartments(List<Department> departments) {
        this.departments = departments;
        return this;
    }
}
