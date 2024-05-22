package org.company;
import org.client.*;

public class Company extends Client{
	public void companyName() {
		System.out.println("Amazon");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		c.clientName();
		
	}

}
