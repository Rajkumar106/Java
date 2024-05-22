package org.bank;

class BankInfo {
	public void saving() {
		System.out.println("showing your savings details");
	}
	public void fixed() {
		System.out.println("showing your FD details");
	}
	public void deposit() {
		System.out.println("showing your deposit details");
	}

}
class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Showing last 5 deposits");
		super.saving();
		super.deposit();
		super.fixed();
		
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
	}
}
