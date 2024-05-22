package org.emp;
import org.client.*;
import org.company.*;
import org.project.*;

public class Employee {
	public void empName() {
		System.out.println("EmpName: Messi");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		Employee e = new Employee();
		e.empName();
		Project p = new Project();
		p.projectName();
		Client cl = new Client();
		cl.clientName();
	}

}
