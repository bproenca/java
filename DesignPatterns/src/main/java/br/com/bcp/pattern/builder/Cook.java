package br.com.bcp.pattern.builder;

/** "Director" */
class Cook {
	private PizzaBuilder pizzaBuilder;

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void setPizzaBuilder(final PizzaBuilder pb) {
		pizzaBuilder = pb;
	}
}
