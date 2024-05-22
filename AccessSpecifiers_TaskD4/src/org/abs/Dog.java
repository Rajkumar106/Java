package org.abs;

//Same package using Abstract class
public class Dog extends Animal1{

	@Override
	public void sound() {
		System.out.println("Dog is Barking");
	}

	@Override
	protected void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	void run() {
		System.out.println("Dog is running");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.eat();
		d.run();
		
	}
}