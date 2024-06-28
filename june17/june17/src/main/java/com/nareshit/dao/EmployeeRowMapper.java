package com.nareshit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nareshit.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	//@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}
}
