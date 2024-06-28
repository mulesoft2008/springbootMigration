package com.nareshit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.dao.EmployeeDao;
import com.nareshit.model.Employee;

public class TestSpringJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//EmployeeDao dao = ctx.getBean("dao1",EmployeeDao.class);
		EmployeeDao dao = ctx.getBean("dao2",EmployeeDao.class);
		//EmployeeDao dao = ctx.getBean("dao3",EmployeeDao.class);
		/*
		Employee emp = new Employee(4,"Seeta","Ameerpet",6000.25);
		dao.saveEmployee(emp);
		System.out.println("Employee object is saved successfully...");
		*/
		
		/*
		Employee emp = new Employee(4,"Arun","Pune",12000.25);
		dao.updateEmployee(emp);
		System.out.println("Employee object is updated successfully...");
		*/
		
		dao.deleteEmployee(4);
		System.out.println("Employee object is deleted successfully...");
		
		
	}
}
