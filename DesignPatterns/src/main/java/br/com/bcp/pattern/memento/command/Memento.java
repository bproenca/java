package br.com.bcp.pattern.memento.command;

class Memento {
	int num;

	Memento(final int c) {
		num = c;
	}

	int getNum() {
		return num;
	}
}
