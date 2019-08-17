package br.com.bcp.pattern.chainofresp;

class EmailLogger extends Logger {

	public EmailLogger(final int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(final String msg) {
		System.out.println("2-Sending via email: " + msg);
	}
}
