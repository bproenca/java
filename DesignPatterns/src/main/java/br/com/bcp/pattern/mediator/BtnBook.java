package br.com.bcp.pattern.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnBook extends JButton implements Command {
	Mediator med;

	BtnBook(ActionListener al, final Mediator m) {
		super("Book");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}

	public void execute() {
		med.book();
	}
}
