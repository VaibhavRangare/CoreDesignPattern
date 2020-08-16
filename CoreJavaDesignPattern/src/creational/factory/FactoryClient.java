package creational.factory;

public class FactoryClient {

	public static void main(String[] args) {
		Shape s = ShapeFactory.getInstance("circle");
		s.draw();
		s = ShapeFactory.getInstance("ractangle");
		s.draw();
	}
}
