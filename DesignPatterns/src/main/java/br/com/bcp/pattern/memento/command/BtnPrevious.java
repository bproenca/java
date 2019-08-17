package br.com.bcp.pattern.memento.command;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnPrevious extends JButton implements Command {
	Mediator med;

	BtnPrevious(ActionListener al, final Mediator m) {
		super("Previous");
		addActionListener(al);
		med = m;
		med.registerPrevious(this);
	}

	public void execute() {
		med.previous();
	}
}
