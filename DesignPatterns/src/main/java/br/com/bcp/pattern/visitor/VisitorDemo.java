package br.com.bcp.pattern.visitor;

public class VisitorDemo {
	static public void main(final String[] args) {
		final Car car = new Car();
		final Visitor printVisitor = new PrintVisitor();
		final Visitor doVisitor = new DoVisitor();
		printVisitor.visitCar(car);
		doVisitor.visitCar(car);
	}
}
