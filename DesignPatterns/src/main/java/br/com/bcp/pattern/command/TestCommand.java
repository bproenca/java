package br.com.bcp.pattern.command;

/* The test class */
public class TestCommand {
	public static void main(final String[] args) {
		final Light l = new Light();
		final Command switchUp = new TurnOnLightCommand(l);
		final Command switchDown = new TurnOffLightCommand(l);

		final Switch s = new Switch(switchUp, switchDown);

		s.flipUp();
		s.flipDown();
	}
}
