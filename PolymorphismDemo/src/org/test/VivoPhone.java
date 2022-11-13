package org.test;

public class VivoPhone extends ApplePhone {

	
	public void mobWeight() {
		System.out.println(" 500 grm");

	}
	
	public void mobRamSize() {
		System.out.println("8gb ram");
}
	
	public static void main(String[] args) {
		
		VivoPhone v=new VivoPhone();
		v.mobRamSize();
		v.mobWeight();
	}
}