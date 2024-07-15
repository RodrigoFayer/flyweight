package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    void shouldReturnEmployeeList() {
        Company company = new Company();
        company.addEmployee("John Doe", "Developer", "dev");
        company.addEmployee("Jane Doe", "Tester", "product");
        company.addEmployee("Jim Doe", "Developer", "dev");

        assertEquals("Employee: John Doe, Role: Developer, Squad: dev", company.getEmployees().get(0));
        assertEquals("Employee: Jane Doe, Role: Tester, Squad: product", company.getEmployees().get(1));
        assertEquals("Employee: Jim Doe, Role: Developer, Squad: dev", company.getEmployees().get(2));
    }

    @Test
    void shouldReturnTotalRoleCount() {
        Company company = new Company();
        company.addEmployee("John Doe", "Developer", "dev");
        company.addEmployee("Jane Doe", "Tester", "product");
        company.addEmployee("Jim Doe", "Developer", "dev");

        assertEquals(2, RoleFactory.getRoleCount());
    }
}