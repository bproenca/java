package br.com.bcp.pattern.memento.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MementoDemo extends JFrame implements ActionListener {
	public static void main(final String[] args) {
		new MementoDemo();
	}

	Mediator med = new Mediator();

	MementoDemo() {
		JPanel p = new JPanel();
		p.add(new BtnDice(this, med));
		p.add(new BtnPrevious(this, med));
		p.add(new BtnClear(this, med));
		JPanel dice = new JPanel();
		final LblDisplay lbl = new LblDisplay(med);
		dice.add(lbl);
		getContentPane().add(dice, "Center");
		getContentPane().add(p, "South");
		setTitle("Memento pattern example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		final Command comd = (Command) ae.getSource();
		comd.execute();
	}
}
