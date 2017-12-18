package com.bridgeit.model;
import java.util.List;

/**
* Model class for the book details.
*/
public class UserBean {

  private int id;
  
  private String Name;
  
  private int age;
	
  public int getId() {
		return id;
	}
	
  public void setId(int id) {
		this.id = id;
	}
	
  public int getAge() {
		return age;
	}
	
  public void setAge(int age) {
		this.age = age;
  }

@Override
public String toString() {
	return "UserBean [id=" + id + ", name=" + Name + ", age=" + age + "]";
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
  
  
}