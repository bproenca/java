package br.com.bcp.pattern.abstractfactory;

class WinFactory extends GUIFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}
}
