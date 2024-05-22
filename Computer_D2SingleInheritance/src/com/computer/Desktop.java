package com.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size: 1TB");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
		
	}

}
