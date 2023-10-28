// Write your code here
package com.example.employee;

import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmplist();

    Employee addEmployee(Employee employee);

    Employee getEmpById(int empId);

    Employee updateEmp(int empId, Employee employee);
    void deleteEmp(int empId);
}