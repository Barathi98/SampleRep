package collections;

import java.util.*;  

class Student implements Comparable<Student> {  //student is the user defined object
    public String name;
    public int age;
  public Student(String name, int age) {  
    this.name = name;
    this.age= age;
  }  
  public int compareTo(Student student1) {
      return this.age - student1.age;
  }  
      
  }     
public class TestSort4 {  
  public static void main(String[] args) {  
      ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Viru",18));  
      al.add(new Student("Saurav",17));  
      al.add(new Student("Mukesh",16));  
      al.add(new Student("Tahir",12));  
      
    Collections.sort(al);  
    for (Student s : al) {  
      System.out.println(s.name+ " " +s.age);  
    }  
  }  
}  