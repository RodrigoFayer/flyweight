package org.example;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, String role, String squad) {
        Role roleObj = RoleFactory.getRole(role, squad);
        Employee employee = new Employee(name, roleObj);
        employees.add(employee);
    }

    public List<String> getEmployees() {
        List<String> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            employeeList.add(employee.getEmployee());
        }

        return employeeList;
    }
}
