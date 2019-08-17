package br.com.bcp.pattern.memento;

class Originator {
	private static class Memento {
		private final String state;

		public Memento(final String stateToSave) {
			state = stateToSave;
		}

		public String getSavedState() {
			return state;
		}
	}

	private String state;

	/*
	 * lots of memory consumptive private data that is not necessary to define
	 * the state and should thus not be saved. Hence the small memento object.
	 */

	public void restoreFromMemento(final Object m) {
		if (m instanceof Memento) {
			final Memento memento = (Memento) m;
			state = memento.getSavedState();
			System.out
					.println("Originator: State after restoring from Memento: "
							+ state);
		}
	}

	public Object saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(state);
	}

	public void set(final String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}
}
