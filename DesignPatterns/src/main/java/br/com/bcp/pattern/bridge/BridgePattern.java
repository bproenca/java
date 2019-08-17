package br.com.bcp.pattern.bridge;

/** "Client" */
class BridgePattern {
	public static void main(final String[] args) {
		final Shape[] shapes = new Shape[2];
		shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
		shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());

		for (final Shape shape : shapes) {
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}
}
