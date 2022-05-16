package beanAnnotationLC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanAnnotationLC/configureInterface.xml");
        Person4Interface person=context.getBean(Person4Interface.class,"person");
        context.registerShutdownHook();
        System.out.println(person);
	}

}
