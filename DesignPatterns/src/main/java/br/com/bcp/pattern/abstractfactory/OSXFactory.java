package br.com.bcp.pattern.abstractfactory;

class OSXFactory extends GUIFactory {
	@Override
	public Button createButton() {
		return new OSXButton();
	}
}
