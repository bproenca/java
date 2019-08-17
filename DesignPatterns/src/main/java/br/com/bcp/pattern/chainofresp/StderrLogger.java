package br.com.bcp.pattern.chainofresp;

class StderrLogger extends Logger {

	public StderrLogger(final int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(final String msg) {
		System.out.println("3-Sending to stderr: " + msg);
	}
}
