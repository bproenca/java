package br.com.bcp.pattern.visitor;

class Car {
	CarElement[] elements;

	public Car() {
		this.elements = new CarElement[] { new Wheel("front left"),
				new Wheel("front right"), new Wheel("back left"),
				new Wheel("back right"), new Body(), new Engine() };
	}

	public CarElement[] getElements() {
		return elements.clone();
	}
}
