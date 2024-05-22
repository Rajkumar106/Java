package org.bike;

//INTERFACE CLASS
interface Bike { 
	//Abstract methods
	void cost(); 
	void speed();

}

public class Ktm implements Bike { //IMPLEMENTED BIKE

	@Override
	public void cost() {
		System.out.println("The cost of KTM bike is 3lakhs");
	}

	@Override
	public void speed() {
		System.out.println("The max speed of the bike is 220+");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
	
}
