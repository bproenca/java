package br.com.bcp.pattern.memento;

import java.util.ArrayList;
import java.util.List;

class Caretaker {
	private final List<Object> savedStates = new ArrayList<Object>();

	public void addMemento(final Object m) {
		savedStates.add(m);
	}

	public Object getMemento(final int index) {
		return savedStates.get(index);
	}
}