package org.abs;

public interface School {
	
	//protected void schlAdd(); not possible
	public void schlName();
	//private void schlId(); not possible
	default void schlLocation() {
		System.out.println("Chennai");
	}

}