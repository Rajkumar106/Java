package org.emp;

public class Employee {
	public void empId(String address) {
		System.out.println(address);
	}
	public void empId(int empId,String name, long phone) {
		System.out.println(empId+"\n"+name+"\n"+phone);
	}
	public void empId(String name, long phone,int empId) {
		System.out.println(name+"\n"+phone+"\n"+empId);
	}
	public void empId(String name, long phone,int empId, int age) {
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Phn no: "+phone);
		System.out.println("Emp ID is: "+empId);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId("Chennai");
		e.empId(29, "Alex",1363972897l);
		e.empId("Ram", 1578969291l, 91);
		e.empId("Ravi", 9127971672l, 88, 25);
	}

}
