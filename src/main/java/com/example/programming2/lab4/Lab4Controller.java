package com.example.programming2.lab4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@WebServlet(name = "lab4Controller", value = "/lab4Controller")
public class Lab4Controller extends HttpServlet {
    private static Random random = new Random();
    private Company company;

    @Override
    public void init() throws ServletException {
        super.init();
        ArrayList<Department> departments = new ArrayList<>();
        List<Employee> departmentOneEmployees = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            departmentOneEmployees.add(new Employee("Name" + i, "Last name" + i, random.nextInt(2500) + 500));
        }
        departments.add(new Department("Engineering", new Employee("Steven", "Jones", 1251), departmentOneEmployees));
        company = new Company("Title", new Employee("Jack", "Smith", 2512), departments);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String task = request.getParameter("task");

        if (task.equals("0")) {
            // Task 1
            int maxSalary = company.getDirector().getSalary();
            Iterator iterator = company.getDepartments().iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
                if (next instanceof Department) {
                    Department department = (Department) next;
                    if (department.getHead().getSalary() > maxSalary) {
                        maxSalary = department.getHead().getSalary();
                    }

                    Iterator employeeIterator = department.getEmployees().iterator();
                    while (employeeIterator.hasNext()) {
                        Object employeeNext = employeeIterator.next();
                        if (employeeNext instanceof Employee) {
                            Employee employee = (Employee) employeeNext;
                            if (employee.getSalary() > maxSalary) {
                                maxSalary = employee.getSalary();
                            }
                        }
                    }
                }
            }
            System.out.println("Max salary is " + maxSalary);

            request.setAttribute("maxSalary", maxSalary);
            RequestDispatcher rd = request.getRequestDispatcher("lab4_max_salary.jsp");
            rd.forward(request, response);
        } else if (task.equals("1")) {
            // Task 2
            Iterator<Department> departmentIterator = company.getDepartments().iterator();
            while (departmentIterator.hasNext()) {
                Department department = departmentIterator.next();

                Iterator<Employee> employeeIterator = department.getEmployees().iterator();

                boolean employeesMakeMoreThanHead = false;

                while (employeeIterator.hasNext()) {
                    Employee employee = employeeIterator.next();

                    if (employee.getSalary() > department.getHead().getSalary()) {
                        employeesMakeMoreThanHead = true;
                    }
                }

                if (employeesMakeMoreThanHead) {
                    System.out.println("Employees make more money than their head in department: " + department.getTitle());
                    request.setAttribute("department", department);
                }

                RequestDispatcher rd = request.getRequestDispatcher("lab4_employee_more_than_head.jsp");
                rd.forward(request, response);
            }
        } else if (task.equals("2")) {
            // Task 3
            ArrayList<Employee> allEmployees = new ArrayList<>();
            allEmployees.add(company.getDirector());
            for (Department department : company.getDepartments()) {
                allEmployees.add(department.getHead());

                for (Employee employee : department.getEmployees()) {
                    allEmployees.add(employee);
                }
            }
            request.setAttribute("allEmployees", allEmployees);
            RequestDispatcher rd = request.getRequestDispatcher("lab4_all_employees.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}