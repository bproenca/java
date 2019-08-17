package br.com.bcp.pattern.abstractfactory;

class OSXButton extends Button {
	@Override
	public void paint() {
		System.out.println("I'm an OSXButton: ");
	}
}
