package br.com.bcp.pattern.memento.command;

import java.awt.Color;
import java.util.ArrayList;

class Mediator {
	BtnDice btnDice;
	BtnPrevious btnPrevious;
	BtnClear btnClear;
	LblDisplay show;
	java.util.List list, undo;
	boolean restart = true;
	int counter = 0, ct = 0;

	// ....
	Mediator() {
		list = new ArrayList();
		undo = new ArrayList();
	}

	void clear() {
		list = new ArrayList();
		undo = new ArrayList();
		counter = 0;
		show.setText("0");
		btnDice.setEnabled(true);
	}

	void previous() {
		show.setForeground(Color.red);
		btnDice.setEnabled(false);
		if (undo.size() > 0) {
			ct = undo.size() - 1;
			final Memento num = (Memento) undo.get(ct);
			show.setText("" + num.getNum());
			undo.remove(ct);
		} else {
			show.setText("0");
		}
	}

	void registerClear(final BtnClear c) {
		btnClear = c;
	}

	void registerDice(final BtnDice d) {
		btnDice = d;
	}

	void registerDisplay(final LblDisplay d) {
		show = d;
	}

	void registerPrevious(final BtnPrevious p) {
		btnPrevious = p;
	}

	void throwit() {
		show.setForeground(Color.black);
		final int num = (int) (Math.random() * 6 + 1);
		final int i = counter++;
		list.add(i, new Integer(num));
		undo.add(i, new Memento(num));
		show.setText("" + num);
	}

}
