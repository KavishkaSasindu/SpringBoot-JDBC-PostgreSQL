package com.example.SpringJDBCPostgreS.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeRoll;
    private int employeeSalary;

    public Employee() {
        System.out.println("Employee Constructor");
    }

    public Employee(int employeeId, String employeeName, String employeeRoll, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRoll = employeeRoll;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRoll() {
        return employeeRoll;
    }

    public void setEmployeeRoll(String employeeRoll) {
        this.employeeRoll = employeeRoll;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeRoll='" + employeeRoll + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
