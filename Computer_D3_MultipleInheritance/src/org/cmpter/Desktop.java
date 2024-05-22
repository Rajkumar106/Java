package org.cmpter;

public class Desktop implements Hardware,Software {
	private void desktopModel() {
		System.out.println("Desktop version 1.1");
	}

	@Override
	public void softwareResources() {
		System.out.println("Softwares purchased from chennai");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardwares purchased from Tambaram");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}

}
