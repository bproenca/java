package br.com.bcp.pattern.visitor;

class DoVisitor implements Visitor {
	public void visit(final Body body) {
		System.out.println("Moving my body");
	}

	public void visit(final Engine engine) {
		System.out.println("Starting my engine");
	}

	public void visit(final Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName());
	}

	public void visitCar(final Car car) {
		System.out.println("\nStarting my car");
		for (final CarElement carElement : car.getElements()) {
			carElement.accept(this);
		}
		System.out.println("Started car");
	}

}
