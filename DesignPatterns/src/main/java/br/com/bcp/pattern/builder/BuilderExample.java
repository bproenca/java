package br.com.bcp.pattern.builder;

/** A given type of pizza being constructed. */
public class BuilderExample {
	public static void main(final String[] args) {
		final Cook cook = new Cook();
		final PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		final PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();

		System.out.println(cook.getPizza());

		// ------------------------------------
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();

		System.out.println(cook.getPizza());

	}
}
