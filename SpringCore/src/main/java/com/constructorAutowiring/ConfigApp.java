package com.constructorAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {

	public static void main(String[] args) {
		ApplicationContext appcontext=new AnnotationConfigApplicationContext(ConfigMain.class);
		Pepsi pepsi=(Pepsi) appcontext.getBean("getPepsi");
        System.out.println(pepsi);
	}

}
