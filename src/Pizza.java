
public class Pizza {
	
	private PizzaSize pizzaSize;
	private String[] toppings;
	
	public Pizza(PizzaSize pizzaSize, String[] toppings) {
		this.pizzaSize = pizzaSize;
		this.toppings = toppings;
	}
	
	public PizzaSize pizzaSize() {
//		if (pizzaSize.equals("small")) {
//			return PizzaSize.Small;
//		} else if(pizzaSize.equals("medium")) {
//			return PizzaSize.Medium;
//		} else {
//			return PizzaSize.Large;
//		}
		return pizzaSize;
	}
	
	public String[] toppings() {
		return toppings;
	}

}
