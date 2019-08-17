package br.com.bcp.pattern.visitor;

class Engine implements CarElement {
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
}
