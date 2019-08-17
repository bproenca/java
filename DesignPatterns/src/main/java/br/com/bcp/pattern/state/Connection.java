package br.com.bcp.pattern.state;

abstract class Connection {
	public abstract void close();

	public abstract void log();

	public abstract void open();
}
