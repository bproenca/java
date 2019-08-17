package br.com.bcp.pattern.builder;

/** "Abstract Builder" */
abstract class PizzaBuilder {
	protected Pizza pizza;

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public Pizza getPizza() {
		return pizza;
	}
}
