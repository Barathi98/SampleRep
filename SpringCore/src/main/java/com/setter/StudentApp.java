package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		AbstractApplicationContext appContext=new ClassPathXmlApplicationContext("com/setter/configure.xml");
		Student student=appContext.getBean(Student.class,"student");
		appContext.registerShutdownHook();
		System.out.println(student);

	}

}
