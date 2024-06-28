package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nareshit.model.Employee;

public class EmployeeDaoSupportImpl extends JdbcDaoSupport implements EmployeeDao{
	
	private final String INSERT = "insert into employee values(?,?,?,?)";
	private final String UPDATE = "update employee set name=?, address=?, salary=? where id=?";
	private final String DELETE = "delete from employee where id=?";
	
	@Override
	public void saveEmployee(Employee emp) {
		getJdbcTemplate().update(INSERT, new Object[] {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});		
	}

	@Override
	public void updateEmployee(Employee emp) {
		getJdbcTemplate().update(UPDATE, new Object[] {emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId()});		
	}

	@Override
	public void deleteEmployee(Integer id) {
		getJdbcTemplate().update(DELETE, new Object[] {id});		
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
