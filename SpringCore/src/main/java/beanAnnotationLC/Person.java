package beanAnnotationLC;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
@Value("1")
private int personId;
@Value("Barathi")
private String personName;
@Value("23")
private int age;
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@PostConstruct
public void start()
{
	System.out.println("This start method");
	}
@PreDestroy
public void destroy()
{
	System.out.println("this is destroy method");
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}
