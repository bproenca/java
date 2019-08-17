package br.com.bcp.pattern.state;

class Accounting extends Connection {
	@Override
	public void close() {
		System.out.println("Accounting - close the database");
	}

	@Override
	public void log() {
		System.out.println("Accounting - log activities");
	}

	// ...
	@Override
	public void open() {
		System.out.println("Accounting - open database for accounting");
	}
}