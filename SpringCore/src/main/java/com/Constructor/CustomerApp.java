package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("com/Constructor/configureConstructor.xml");
        Customer customerobj=appContext.getBean(Customer.class,"customer");
        System.out.println(customerobj);
    }
}
