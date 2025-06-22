package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeManagerTest {

	private static EmployeeManager employeeManager;

	@BeforeEach
	void setUp(){
		employeeManager = new EmployeeManager();
	}

	@Test
	void addNewEmployee() {
		Employee newEmployee = new Employee("4", "test4", "test4", "test4@g.com", "test4");
		employeeManager.addEmployee(newEmployee);
		Employees employees = employeeManager.getAllEmployees();
		assertEquals(4, employees.getEmployeeList().size());
		assertEquals(newEmployee, employees.getEmployeeList().get(3));
	}
}
