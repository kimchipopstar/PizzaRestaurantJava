import java.util.Arrays;
import java.util.Scanner;
public class PizzaRestaurantjava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick your size");
		String userInputForSize = scanner.nextLine();
		PizzaSize pizzaSize = PizzaSize.valueOf(userInputForSize);
		System.out.println("Choose your toppings");
		String[] userInputForToppings = scanner.nextLine().split(" ");
		Pizza pizza = new Pizza(pizzaSize, userInputForToppings);
		System.out.print(pizza.pizzaSize());
		System.out.print(Arrays.toString(pizza.toppings()));
		
		
	}

}
