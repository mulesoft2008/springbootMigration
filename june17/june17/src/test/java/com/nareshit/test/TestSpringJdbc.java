package com.nareshit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.dao.EmployeeDao;
import com.nareshit.model.Employee;

public class TestSpringJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//EmployeeDao dao = ctx.getBean("dao1",EmployeeDao.class);
		//EmployeeDao dao = ctx.getBean("dao2",EmployeeDao.class);
		EmployeeDao dao = ctx.getBean("dao2",EmployeeDao.class);
		/*
		Employee emp = new Employee(4,"Seeta","Ameerpet",6000.25);
		dao.saveEmployee(emp);
		System.out.println("Employee object is saved successfully...");
		*/
		
		
			
		
		Employee emp = new Employee(1,"Arun","Pune",12001.25);
		dao.updateEmployee(emp);
		System.out.println("Employee object is updated successfully...");
		
		
		
		//dao.deleteEmployee(2);
		//System.out.println("Employee object is deleted successfully...");
		/*
		for(int i=4;i<=20;i++) {
			Employee emp =new Employee(Integer.valueOf(i),"Hello","World",Double.valueOf(1200));
			dao.saveEmployee(emp);
		}
		System.out.println("All are recorded ....");
		
		for(Employee emp : dao.getAllEmployees())
			System.out.println(emp);
		*/
//		System.out.println(dao.getEmployee(5));
		
	}
}
