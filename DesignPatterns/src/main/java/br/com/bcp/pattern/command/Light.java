package br.com.bcp.pattern.command;

/* Receiver class */

public class Light {
	public Light() {
	}

	public void turnOff() {
		System.out.println("The light is off");
	}

	public void turnOn() {
		System.out.println("The light is on");
	}
}
