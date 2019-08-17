package br.com.bcp.pattern.visitor;

class Wheel implements CarElement {
	private final String name;

	Wheel(final String name) {
		this.name = name;
	}

	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}

	String getName() {
		return this.name;
	}
}
