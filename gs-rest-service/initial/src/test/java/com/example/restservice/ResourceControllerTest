package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class ResourceControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private ResourceController resourceController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllEmployees() {
        Employee employee1 = new Employee("1", "test1", "test1", "test1@g.com", "test1");
        Employee employee2 = new Employee("2", "test2", "test2", "test2@g.com", "test2");
        Employees employees = new Employees();
        employees.getEmployeeList().addAll(Arrays.asList(employee1, employee2));

        given(employeeManager.getAllEmployees()).willReturn(employees);
        Employees result = resourceController.getEmployees();

        assertThat(result).isNotNull();
        assertThat(result.getEmployeeList().size()).isEqualTo(2);
        assertThat(result.getEmployeeList()).contains(employee1, employee2);
    }
}
