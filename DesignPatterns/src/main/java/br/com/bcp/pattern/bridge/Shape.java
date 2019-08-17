package br.com.bcp.pattern.bridge;

/** "Abstraction" */
interface Shape {
	public void draw(); // low-level

	public void resizeByPercentage(double pct); // high-level
}
