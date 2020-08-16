package behavioral.strategy;

public class Substractor implements Arithmetic {

	@Override
	public int performOperation(int i1, int i2) {
		return i1 - i2;

	}

}
