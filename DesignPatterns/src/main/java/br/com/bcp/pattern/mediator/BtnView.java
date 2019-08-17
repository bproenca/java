package br.com.bcp.pattern.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Then, you may define classes which should be controlled by the Mediator
 * class.
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
class BtnView extends JButton implements Command {
	Mediator med;

	BtnView(final ActionListener al, final Mediator m) {
		super("View");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}

	public void execute() {
		med.view();
	}
}
