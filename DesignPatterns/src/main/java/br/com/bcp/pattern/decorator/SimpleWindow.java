package br.com.bcp.pattern.decorator;

// implementation of a simple Window without any scrollbars
class SimpleWindow implements Window {
	public void draw() {
		// draw window
		System.out.println("draw window");
	}

	public String getDescription() {
		return "simple window";
	}
}
