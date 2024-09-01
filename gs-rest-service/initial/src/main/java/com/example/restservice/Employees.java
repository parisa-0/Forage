package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    public List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
}
