package br.com.bcp.pattern.abstractfactory;

class WinButton extends Button {
	@Override
	public void paint() {
		System.out.println("I'm a WinButton: ");
	}
}
