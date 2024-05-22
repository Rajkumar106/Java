package org.edu;

class Education{
	public void ug() {
		System.out.println("Iam doing my ug in Chennai");
	}
	public void pg() {
		System.out.println("Iam doing my pg in Trichy");
	}
	
}

public class Arts extends Education{
	public void bSc() {
		System.out.println("I have joined bSc course");
	}
	public void bEd() {
		System.out.println("I am doing bEd now");
	}
	public void bA() {
		System.out.println("I did bA in English Lit");
	}
	public void bBa() {
		System.out.println("I planned to join bBa");
	}
	@Override
	public void ug() {
		//super.ug();
		System.out.println("I have completed my ug now");
	}
	@Override
	public void pg() {
		super.pg();
		System.out.println("I Have completed my pg now");
	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.ug();
		a.pg();
		a.bA();
		
	}
	
}
