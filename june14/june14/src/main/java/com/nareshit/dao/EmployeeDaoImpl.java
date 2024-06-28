package com.nareshit.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nareshit.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private final String INSERT = "insert into employee values(?,?,?,?)";
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveEmployee(Employee emp) {
		jdbcTemplate.update(INSERT, new Object[] {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});		
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


}
