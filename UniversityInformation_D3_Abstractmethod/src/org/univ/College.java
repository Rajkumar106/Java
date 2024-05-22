package org.univ;

public class College extends University{
	@Override
	void ug() {
		System.out.println("UG admissions are opened in our college");
	}

	@Override
	void pg() {
		System.out.println("PG admissions are opened in our college");
	}
	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();
	}

}
