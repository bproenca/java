package br.com.bcp.pattern.decorator;

// abstract decorator class - note that it implements Window
abstract class WindowDecorator implements Window {
	protected Window decoratedWindow; // the Window being decorated

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}
