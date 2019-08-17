package br.com.bcp.pattern.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

class BtnSearch extends JButton implements Command {
	Mediator med;

	BtnSearch(ActionListener al, final Mediator m) {
		super("Search");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}

	public void execute() {
		med.search();
	}
}
