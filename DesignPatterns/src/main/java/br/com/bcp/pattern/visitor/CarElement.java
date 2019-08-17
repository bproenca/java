package br.com.bcp.pattern.visitor;

interface CarElement {
	public void accept(Visitor visitor);
}
