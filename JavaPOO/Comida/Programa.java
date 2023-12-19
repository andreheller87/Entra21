package Comida;

public class Programa {

	public static void main(String args[]) {
		
		Forno forno = new Forno();
		PizzaCalabresa pizzaCalabresa = new PizzaCalabresa();
		forno.fabricar(pizzaCalabresa);
		System.exit(0);
	}
}
