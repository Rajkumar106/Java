package org.def;

import org.abc.Student;

public class School extends Student{
	@SuppressWarnings("unused")
	private void schoolName() {
		System.out.println("schl name is ABD");
	}
	public static void main(String[] args) {
		School s = new School();
		s.studName();
		
	}

}