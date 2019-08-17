package br.com.bcp.pattern.decorator;

// the second concrete decorator which adds horizontal scrollbar functionality
class HorizontalScrollBarDecorator extends WindowDecorator {
	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawHorizontalScrollBar();
		decoratedWindow.draw();
	}

	private void drawHorizontalScrollBar() {
		// draw the horizontal scrollbar
		System.out.println("draw the horizontal scrollbar");
	}

	public String getDescription() {
		return decoratedWindow.getDescription()
				+ ", including horizontal scrollbars";
	}
}
