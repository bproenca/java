package br.com.bcp.pattern.memento.command;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnClear extends JButton implements Command {
	Mediator med;

	BtnClear(ActionListener al, final Mediator m) {
		super("Clear");
		addActionListener(al);
		med = m;
		med.registerClear(this);
	}

	public void execute() {
		med.clear();
	}
}