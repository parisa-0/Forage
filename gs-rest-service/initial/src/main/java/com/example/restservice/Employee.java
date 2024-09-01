package com.example.restservice;

public class Employee {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public String getEmployee_id() {
        return employee_id;
    }

    public Employee(String employee_id, String first_name, String last_name, String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    @Override
    public String toString()
    {

        return "Employee: ID = "
                + employee_id + ", First Name = "
                + first_name + ", Last Name = "
                + last_name + ", email = "
                + email + ", title = "
                + title;
    }
}
