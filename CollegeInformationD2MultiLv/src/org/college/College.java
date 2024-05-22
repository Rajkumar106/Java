package org.college;

public class College extends Student {
	public void collegeName() {
		System.out.println("SRM college");
	}
	public void collegeCode() {
		System.out.println("1304");
	}
	public void collegeRank() {
		System.out.println("Rank 10");
	}
	public static void main(String[] args) {
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.studentName();
		c.studentId();
		c.studentDept();
		c.deptName();
		c.hostelName();
		
	}

}
