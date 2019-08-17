package br.com.bcp.pattern.builder;

/** "Product" */
class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";

	public void setDough(final String dough) {
		this.dough = dough;
	}

	public void setSauce(final String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(final String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "dough:" + dough + " sauce:" + sauce + " topping:" + topping;
	}
}
