package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/Collection/configureCollection.xml");
		Employee employeeobj=applicationContext.getBean(Employee.class,"employee");
		System.out.println(employeeobj);
	}

}
