package br.com.bcp.pattern.state;

class Management extends Connection {
	@Override
	public void close() {
		System.out.println("Management - close the database");
	}

	@Override
	public void log() {
		System.out.println("Management - log activities");
	}

	// ...
	@Override
	public void open() {
		System.out.println("Management - open database for management");
	}
}
