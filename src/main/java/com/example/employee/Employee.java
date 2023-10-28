// Write your code here
package com.example.employee;

public class Employee {
    private int empId;
    private String name;
    private String email;
    private String dept;

    public Employee(int empId, String name, String email, String dept) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}