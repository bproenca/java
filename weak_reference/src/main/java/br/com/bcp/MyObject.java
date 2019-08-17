package br.com.bcp;

public class MyObject {

	private final int id;
	private String content;

	public MyObject(final int id) {
		this.id = id;
		int len = (int) (Math.random() * 20);
		this.content = new String(new char[len]);
	}

	public int getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
