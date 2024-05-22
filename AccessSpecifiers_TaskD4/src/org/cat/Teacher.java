package org.cat;
import org.abs.*;

//Different Package using Interface
public class Teacher implements School {

	@Override
	public void schlName() {
		System.out.println("AAA School");
	}
	@Override
	public void schlLocation() {
		System.out.println("Trichy");
	}
	public static void main(String[] args) {
		Teacher t =new Teacher();
		t.schlName();
		t.schlLocation();
	}

}    
