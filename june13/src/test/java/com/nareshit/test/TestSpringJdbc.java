package com.nareshit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.dao.EmployeeDao;
import com.nareshit.model.Employee;

public class TestSpringJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao",EmployeeDao.class);
		Employee emp = new Employee(2,"Ravi","KPHB",4560.25);
		dao.saveEmployee(emp);
		System.out.println("Employee object is saved successfully...");
	}
}
