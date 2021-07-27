package oop_programming.person;

public class Student extends Person {

	String schoolName;
	
	Student(String schoolName){
		super();
		this.schoolName = schoolName;
	}
	
	Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public void showInfo() {
		Student s = null;
		name = s.getName();
		age = s.getAge();
		schoolName = s.getSchoolName();
		System.out.println(s.toString());
		
	}
	
	
}
