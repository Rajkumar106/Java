package org.cat;

import org.abs.Animal;

//Different package using Abstract class
public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("cat sounds meow meow");
	}

	@Override
	protected void eat() {
		System.out.println("cat is eating");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound();
		c.eat();

	}
	
}
