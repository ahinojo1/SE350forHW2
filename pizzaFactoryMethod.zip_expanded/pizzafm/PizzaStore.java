package headfirst.factory.pizzafm;

public abstract class PizzaStore {
 
	//abstract factory method
	abstract Pizza createPizza(String item);
 
	//anOperation() which calls the abstract factory method
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
