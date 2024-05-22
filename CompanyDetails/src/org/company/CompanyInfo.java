package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Tata");
	}
	private void companyId(){
		System.out.println("1011");
	}
	private void companyAddress() {
		System.out.println("velachery,chennai");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyAddress();
		c.companyId();
		c.companyName();
	}
}
