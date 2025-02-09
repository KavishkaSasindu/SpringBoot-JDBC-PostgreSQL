package com.example.SpringJDBCPostgreS.service;

import com.example.SpringJDBCPostgreS.model.Employee;
import com.example.SpringJDBCPostgreS.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeService() {
        System.out.println("EmployeeService constructor");
    }

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

//    getters and setters
    public EmployeeRepo getEmployeeRepo() {
        return employeeRepo;
    }

    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

//    methods
    public void addEmployee(Employee employee) {
        employeeRepo.saveInDb(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees = employeeRepo.fetchAllFromDb();
        return employees;
    }
}
