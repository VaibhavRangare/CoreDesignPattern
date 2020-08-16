package behavioral.strategy;

public class UseStrategy {
	Arithmetic a;

	public UseStrategy(Arithmetic a) {
		this.a = a;
	}

	public void strategy(int i1, int i2) {
		int result = a.performOperation(i1, i2);
		System.out.println(result);
	}

}
