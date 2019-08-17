package br.com.bcp.pattern.observer;

public class myapp {
	public static void main(final String args[]) {
		System.out.println("Enter Text >");

		// create an event source - reads from stdin
		final EventSource evSrc = new EventSource();

		// create an observer
		final ResponseHandler respHandler = new ResponseHandler();

		// subscribe the observer to the event source
		evSrc.addObserver(respHandler);

		// starts the event thread
		final Thread thread = new Thread(evSrc);
		thread.start();
	}
}
