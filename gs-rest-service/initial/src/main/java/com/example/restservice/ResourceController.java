package com.example.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;

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
    @PostMapping(
            path = "/employees",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeManager.addEmployee(employee);
    }

}
