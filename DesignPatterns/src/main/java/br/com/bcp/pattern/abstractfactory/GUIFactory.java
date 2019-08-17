package br.com.bcp.pattern.abstractfactory;

/*
 * GUIFactory example
 */
abstract class GUIFactory {
	public static GUIFactory getFactory() {
		final int sys = readFromConfigFile("OS_TYPE");
		if (sys == 0) {
			return new WinFactory();
		} else {
			return new OSXFactory();
		}
	}

	private static int readFromConfigFile(final String pString) {
		return 0;
	}

	public abstract Button createButton();
}
