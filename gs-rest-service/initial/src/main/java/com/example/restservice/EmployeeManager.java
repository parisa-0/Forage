package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
static Employee employee1 = new Employee("1", "test1", "test1", "test1@g.com", "test1");
static Employee employee2 = new Employee("2", "test2", "test2", "test2@g.com", "test2");
static Employee employee3 = new Employee("3", "test3", "test3", "test3@g.com", "test3");

    private static Employees list = new Employees();

    static {
        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
    }

    public static Employees getAllEmployees() {
        return list;
    }
}
