package br.com.bcp.pattern.visitor;

class PrintVisitor implements Visitor {

	public void visit(final Body body) {
		System.out.println("Visiting body");
	}

	public void visit(final Engine engine) {
		System.out.println("Visiting engine");
	}

	public void visit(final Wheel wheel) {
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}

	public void visitCar(final Car car) {
		System.out.println("\nVisiting car");
		for (final CarElement element : car.getElements()) {
			element.accept(this);
		}
		System.out.println("Visited car");
	}
}
