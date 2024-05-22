package org.abs;

//Same package using Interface
public class Students implements School {

	@Override
	public void schlName() {
		System.out.println("XYZ School");
	}
	public void studName() {
		System.out.println("studName: Ravi");
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.schlName();
		s.schlLocation();
		s.studName();
	}

}