package br.com.bcp.pattern.state;

class Server {
	public static Test test;

	public static void main(final String[] args) {
		new Test("management");
		System.out.println("");
		new Test("accounting");
		System.out.println("");
		new Test("sales");
	}
}
