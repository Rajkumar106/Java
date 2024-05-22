package org.schl;

public class Student extends Teacher implements School,Branch{

	@Override
	public void location() {
		System.out.println("located in Chennai");
	}

	@Override
	public void schoolName() {
		System.out.println("ABC School");
	}
	public void studentCount() {
		System.out.println("600+ students studying");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.schoolName();
		s.teachersCount();
		s.studentCount();
	}
	

}
