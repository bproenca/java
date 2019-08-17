package br.com.bcp.pattern.memento.command;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnDice extends JButton implements Command {
	Mediator med;

	BtnDice(ActionListener al, final Mediator m) {
		super("Throw Dice");
		addActionListener(al);
		med = m;
		med.registerDice(this);
	}

	public void execute() {
		med.throwit();
	}
}
