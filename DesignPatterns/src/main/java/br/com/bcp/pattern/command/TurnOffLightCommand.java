package br.com.bcp.pattern.command;

/* the Command for turning off the light */

public class TurnOffLightCommand implements Command {
	private final Light theLight;

	public TurnOffLightCommand(final Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOff();
	}
}
