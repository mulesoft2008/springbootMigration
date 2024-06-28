package com.nareshit.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import static com.nareshit.constant.Constant.INSERT;
import static com.nareshit.constant.Constant.UPDATE;
import static com.nareshit.constant.Constant.DELETE;
import static com.nareshit.constant.Constant.GET_ALL;
import static com.nareshit.constant.Constant.GET_ONE;

import com.nareshit.model.Employee;

@Component("dao1")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("employeeRowMapper")
	private RowMapper<Employee> rowMapper;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setRowMapper(RowMapper<Employee> rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	@Override
	public void saveEmployee(Employee emp) {
		jdbcTemplate.update(INSERT, new Object[] {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});		
	}

	@Override
	public void updateEmployee(Employee emp) {
		jdbcTemplate.update(UPDATE, new Object[] {emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId()});		
	}

	@Override
	public void deleteEmployee(Integer id) {
		jdbcTemplate.update(DELETE, new Object[] {id});		
	}


	@Override
	public Employee getEmployee(Integer id) {
		List<Employee> emps = jdbcTemplate.query(GET_ONE,new Object[] {id},rowMapper);
		return emps.get(0);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = jdbcTemplate.query(GET_ALL, rowMapper);
		return emps;
	}


}
