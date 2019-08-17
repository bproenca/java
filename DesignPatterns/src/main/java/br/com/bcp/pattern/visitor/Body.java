package br.com.bcp.pattern.visitor;

class Body implements CarElement {
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
}
