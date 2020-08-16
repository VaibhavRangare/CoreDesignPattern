package creational.abstractfactor;

public class AFactoryClient {

	public static void main(String[] args) {
		AFactory fact = FactoryProducer.getFactory("line");
		System.out.println(fact);
		Line l = fact.getLineInstance("solidline");
		System.out.println(l);
		l.draw();
	}

}
