package org.test;

public class Student {
	
	public void stuDetails() {
		
System.out.println("this is student details method");
	}

	public void stuDetails(int stuMark) {
		
		System.out.println(stuMark);
	}
	
public void stuDetails(String stuName,int stuMark) {
		
		System.out.println(stuName+" "+stuMark);
	}
	
	public static void main(String[] args) {
		///method overloading
		
		Student s=new Student();
		s.stuDetails();
		s.stuDetails(50);
		s.stuDetails("ramesh", 60);

	}

}
