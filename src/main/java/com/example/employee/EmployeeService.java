/*
 * You can use the following import statements
 * 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 * 
 */

package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeRepository;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.*;

// Do not modify the below code

public class EmployeeService implements EmployeeRepository {

    private static HashMap<Integer, Employee> employeeList = new HashMap<>();
    int uniqueEmpId = 7;

    public EmployeeService() {
        employeeList.put(1, new Employee(1, "John Doe", "johndoe@example.com", "Marketing"));
        employeeList.put(2, new Employee(2, "Jane Smith", "janesmith@example.com", "Human Resources"));
        employeeList.put(3, new Employee(3, "Bob Johnson", "bjohnson@example.com", "Sales"));
        employeeList.put(4, new Employee(4, "Alice Lee", "alee@example.com", "IT"));
        employeeList.put(5, new Employee(5, "Mike Brown", "mbrown@example.com", "Finance"));
        employeeList.put(6, new Employee(6, "Sara Lee", "slee@example.com", "Operations"));

    }

    // Do not modify the above code

    // Write your code here
    @Override
    public ArrayList<Employee> getEmplist() {
        Collection<Employee> empCollection = employeeList.values();
        ArrayList<Employee> emplist = new ArrayList<>(empCollection);
        return emplist;
    }

    @Override
    public Employee getEmpById(int empId) {
        Employee employee = employeeList.get(empId);
        if (employee == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmpId(uniqueEmpId);
        employeeList.put(uniqueEmpId, employee);
        uniqueEmpId += 1;

        return employee;
    }

    

    @Override
    public Employee updateEmp(int empId, Employee employee) {
        Employee presentEmp = employeeList.get(empId);
        if (presentEmp == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        if (employee.getName() != null) {
            presentEmp.setName(employee.getName());
        }
        if (employee.getEmail() != null) {
            presentEmp.setEmail(employee.getEmail());
        }
        if (employee.getDept() != null) {
            presentEmp.setDept(employee.getDept());
        }

        return presentEmp;
    }

    @Override
    public void deleteEmp(int empId) {
        Employee employee = employeeList.get(empId);
        if (employee == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            employeeList.remove(empId);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}
