package junit;

public class Student {

	String name;
	String rollno;
	int age;
	
	Student(String name,String rollno,int age){
		
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		
		System.out.println("This is constructor");
	}
	
	String getName() {
		return name;
	}
	String getRollno() {
		return rollno;
	}
	
	int getIage() {
		return age;
	}
}
