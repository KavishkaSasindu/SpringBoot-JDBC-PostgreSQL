package com.example.SpringJDBCPostgreS.repository;

import com.example.SpringJDBCPostgreS.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepo {

    private JdbcTemplate jdbcTemplate;

    public EmployeeRepo() {
        System.out.println("EmployeeRepo constructor");
    }

    @Autowired
    public EmployeeRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    getters and setters
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveInDb(Employee employee) {
        final String sql = "insert into employee (employeeId,employeeName,employeeRoll,employeeSalary) values (?,?,?,?)";

        int rows = jdbcTemplate.update(sql,employee.getEmployeeId(),employee.getEmployeeName(),employee.getEmployeeRoll(),employee.getEmployeeSalary());
        System.out.println("Rows inserted: " + rows);
    }

    public List<Employee> fetchAllFromDb(){
        final String sql = "select * from employee";

        RowMapper<Employee> mapper = (rs,rowNum)->{
            Employee employee = new Employee();
            employee.setEmployeeId(rs.getInt("employeeId"));
            employee.setEmployeeName(rs.getString("employeeName"));
            employee.setEmployeeRoll(rs.getString("employeeRoll"));
            employee.setEmployeeSalary(rs.getInt("employeeSalary"));
            return employee;
        };
        return jdbcTemplate.query(sql,mapper);

    }
}
