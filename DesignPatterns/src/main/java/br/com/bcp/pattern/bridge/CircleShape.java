package br.com.bcp.pattern.bridge;

/** "Refined Abstraction" */
class CircleShape implements Shape {
	private final double x, y;
	private double radius;
	private final DrawingAPI drawingAPI;

	public CircleShape(final double x, final double y, final double radius,
			final DrawingAPI drawingAPI) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawingAPI = drawingAPI;
	}

	// low-level i.e. Implementation specific
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	// high-level i.e. Abstraction specific
	public void resizeByPercentage(final double pct) {
		radius *= pct;
	}
}
