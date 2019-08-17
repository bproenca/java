package br.com.bcp.pattern.chainofresp;

abstract class Logger {
	public static int ERR = 3;
	public static int NOTICE = 5;
	public static int DEBUG = 7;
	protected int mask;

	// The next element in the chain of responsibility
	protected Logger next;

	public void message(final String msg, final int priority) {
		if (priority <= mask) {
			writeMessage(msg);
			if (next != null) {
				next.message(msg, priority);
			}
		}
	}

	public Logger setNext(final Logger l) {
		next = l;
		return l;
	}

	abstract protected void writeMessage(String msg);

}
