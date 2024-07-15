package org.example;

public class Employee {
    private String name;
    private Role role;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getEmployee() {
        return "Employee: " + name + ", Role: " + role.getRole() + ", Squad: " + role.getSquad();
    }
}
