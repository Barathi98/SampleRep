package beanAnnotationLC;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person4Interface implements InitializingBean,DisposableBean 
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


@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
}
public Person4Interface() {
	super();
	// TODO Auto-generated constructor stub
}
public void destroy() throws Exception {
	System.out.println("this is destroy method");
	
}
public void afterPropertiesSet() throws Exception {
	System.out.println("this is start method");
}

	
}


