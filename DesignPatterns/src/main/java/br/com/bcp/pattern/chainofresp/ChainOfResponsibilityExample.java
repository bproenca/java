package br.com.bcp.pattern.chainofresp;

public class ChainOfResponsibilityExample {
	public static void main(final String[] args) {
		// Build the chain of responsibility
		Logger l, l1;
		l1 = l = new StdoutLogger(Logger.DEBUG);
		l1 = l1.setNext(new EmailLogger(Logger.NOTICE));
		l1 = l1.setNext(new StderrLogger(Logger.ERR));

		// Handled by StdoutLogger
		l.message("Entering function y.", Logger.DEBUG);
		System.out.println("");

		// Handled by StdoutLogger and EmailLogger
		l.message("Step1 completed.", Logger.NOTICE);
		System.out.println("");

		// Handled by all three loggers
		l.message("An error has occurred.", Logger.ERR);
		System.out.println("");
	}
}
