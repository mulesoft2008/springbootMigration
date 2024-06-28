package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import static com.nareshit.constant.Constant.INSERT;
import static com.nareshit.constant.Constant.UPDATE;
import static com.nareshit.constant.Constant.DELETE;
import static com.nareshit.constant.Constant.GET_ALL;
import static com.nareshit.constant.Constant.GET_ONE;

import com.nareshit.model.Employee;

public class EmployeeDaoSupportImpl extends JdbcDaoSupport implements EmployeeDao{
	
	private RowMapper<Employee> rowMapper;
	
	public EmployeeDaoSupportImpl() {}
	
	public EmployeeDaoSupportImpl(RowMapper<Employee> rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	public void setRowMapper(RowMapper<Employee> rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	//@Override
	public void saveEmployee(Employee emp) {
		getJdbcTemplate().update(INSERT, new Object[] {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});		
	}

	//@Override
	public void updateEmployee(Employee emp) {
		getJdbcTemplate().update(UPDATE, new Object[] {emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId()});		
	}

	//@Override
	public void deleteEmployee(Integer id) {
		getJdbcTemplate().update(DELETE, new Object[] {id});		
	}

	//@Override
	public Employee getEmployee(Integer id) {
		List<Employee> emps = getJdbcTemplate().query(GET_ONE,new Object[] {id},rowMapper);
		return emps.get(0);
	}

	//@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = getJdbcTemplate().query(GET_ALL, rowMapper);
		return emps;
	}
}
