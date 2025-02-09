package com.example.SpringJDBCPostgreS;

import com.example.SpringJDBCPostgreS.model.Employee;
import com.example.SpringJDBCPostgreS.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcPostgreSApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcPostgreSApplication.class, args);

		Employee employee = context.getBean(Employee.class);
		employee.setEmployeeId(105);
		employee.setEmployeeName("Jack Bauer");
		employee.setEmployeeRoll("Network Engineer");
		employee.setEmployeeSalary(5000);

		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		employeeService.addEmployee(employee);

		List<Employee> employees = employeeService.getAllEmployees();
		System.out.println(employees);

	}

}
