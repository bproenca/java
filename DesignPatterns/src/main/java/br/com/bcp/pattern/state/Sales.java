package br.com.bcp.pattern.state;

class Sales extends Connection {
	@Override
	public void close() {
		System.out.println("Sales - close the database");
	}

	@Override
	public void log() {
		System.out.println("Sales - log activities");
	}

	@Override
	public void open() {
		System.out.println("Sales - open database for sales");
	}

	public void update() {
		//
	}
}
