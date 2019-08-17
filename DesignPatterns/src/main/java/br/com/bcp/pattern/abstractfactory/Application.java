package br.com.bcp.pattern.abstractfactory;

public class Application {
	public static void main(final String[] args) {
		final GUIFactory factory = GUIFactory.getFactory();
		final Button button = factory.createButton();
		button.paint();
	}
	// Output is either:
	// "I'm a WinButton:"
	// or:
	// "I'm an OSXButton:"
}
