package com.constructorAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.Student;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("com/autowiring/configureautowiring.xml");
		Student studentobj=appcontext.getBean(Student.class,"student");
		System.out.println(studentobj);

	}

}
