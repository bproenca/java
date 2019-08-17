package br.com.bcp.pattern.visitor;

interface Visitor {
	void visit(Body body);

	void visit(Engine engine);

	void visit(Wheel wheel);

	void visitCar(Car car);
}
