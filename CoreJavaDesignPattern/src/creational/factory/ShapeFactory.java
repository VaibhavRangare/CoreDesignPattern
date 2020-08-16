package creational.factory;

public class ShapeFactory {

	public static Shape getInstance(String shapeType) {
		Shape shape = null;
		if (shapeType.equals("circle")) {
			shape = new Circle();
		}
		if (shapeType.equals("ractangle")) {
			shape = new Ractangle();
		}
		if (shapeType.equals("square")) {
			shape = new Square();
		}
		return shape;
	}

}
