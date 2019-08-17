package br.com.bcp.pattern.memento;

class MementoExample {
	public static void main(final String[] args) {
		final Caretaker caretaker = new Caretaker();

		final Originator originator = new Originator();
		originator.set("State1");
		originator.set("State2");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State3");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State4");

		originator.restoreFromMemento(caretaker.getMemento(1));
	}
}
