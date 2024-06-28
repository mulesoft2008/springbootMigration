package com.nareshit.dao;

import java.util.List;

import com.nareshit.model.Employee;

public interface EmployeeDao {
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Integer id);
	public Employee getEmployee(Integer id);
	public List<Employee> getAllEmployees();
}
