package com.example.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping(
            path = "/employees",
            produces = "application/json")

    public Employees getEmployees()
    {
        return EmployeeManager.getAllEmployees();
    }


}
