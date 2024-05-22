package org.emp;

public class Employee {
	private void empId() {
		System.out.println("Empid:"+109);
	}
	private void empName() {
		System.out.println("name:"+"Suresh");
	}
	private void empDob() {
		System.out.println("Dob:"+"20/11/2000");
	}
	private void empPhone() {
		System.out.println("Ph no:"+ 8873808389l);
	}
	private void empEmail() {
		System.out.println("email:"+"example@gmail.com");
	}
	private void empAddress() {
		System.out.println("addrs:"+"123,velachery,Chennai");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}

}
