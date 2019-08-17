package br.com.bcp.pattern.mediator;

import java.awt.Font;

import javax.swing.JLabel;

class LblDisplay extends JLabel {
	Mediator med;

	LblDisplay(final Mediator m) {
		super("Just start...");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
}
