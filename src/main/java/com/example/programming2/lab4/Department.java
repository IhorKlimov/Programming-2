package com.example.programming2.lab4;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {
    private String title;
    private Employee head;
    private List<Employee> employees;

    public Department(String title, Employee head, List<Employee> employees) {
        this.title = title;
        this.head = head;
        this.employees = employees;
    }

    public String getTitle() {
        return title;
    }

    public Department setTitle(String title) {
        this.title = title;
        return this;
    }

    public Employee getHead() {
        return head;
    }

    public Department setHead(Employee head) {
        this.head = head;
        return this;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Department setEmployees(List<Employee> employees) {
        this.employees = employees;
        return this;
    }
}
