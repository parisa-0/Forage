package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testCreatingEmployeeAndGettingData() {
        Employee employee = new Employee("1",
                "Test",
                "Test",
                "test@tester.com",
                "testTitle");

        assertEquals("1", employee.getEmployee_id());
        assertEquals("Test", employee.getFirst_name());
        assertEquals("Test", employee.getLast_name());
        assertEquals("test@tester.com", employee.getEmail());
        assertEquals("testTitle", employee.getTitle());
    }
}
