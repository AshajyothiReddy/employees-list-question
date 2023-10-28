/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.employee;

import com.example.employee.EmployeeService;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmplist() {
        return employeeService.getEmplist();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmpById(@PathVariable("empId") int empId) {
        return employeeService.getEmpById(empId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }


    @PutMapping("/employees/{empId}")
    public Employee updateEmp(@PathVariable("empId") int empId, @RequestBody Employee employee){
        return employeeService.updateEmp(empId, employee);
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmp(@PathVariable("empId") int empId){
        employeeService.deleteEmp(empId);
    }
}