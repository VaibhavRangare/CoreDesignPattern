package creational.abstractfactor;

public class FactoryProducer {

	public static AFactory getFactory(String factory) {
		AFactory fact = null;
		if (factory.equals("line")) {
			fact = new LineFactory();
		}
		if (factory.equals("shape")) {
			fact = new ShapeFactory();
		}
		return fact;
	}

}
