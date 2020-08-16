package behavioral.strategy;

public class StructuralClient {

	public static void main(String[] args) {
		UseStrategy us = new UseStrategy(new Substractor());
		us.strategy(10, 20);
	}

}
