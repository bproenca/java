package br.com.bcp.pattern.command.javacamp;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JOptionPane;

class SubmitAction extends AbstractAction {
	private final Component target;

	public SubmitAction(final String name, final Icon icon, final Component t) {
		putValue(Action.NAME, name);
		putValue(Action.SMALL_ICON, icon);
		putValue(Action.SHORT_DESCRIPTION, name + " the program");
		target = t;
	}

	public void actionPerformed(final ActionEvent evt) {
		JOptionPane.showMessageDialog(target, "submit action clicked ");
	}
}