package br.com.bcp.pattern.chainofresp;

class StdoutLogger extends Logger {

	public StdoutLogger(final int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(final String msg) {
		System.out.println("1-Writing to stdout: " + msg);
	}
}
