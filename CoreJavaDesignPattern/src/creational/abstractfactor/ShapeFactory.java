package creational.abstractfactor;

public class ShapeFactory extends AFactory {

	public ShapeFactory getShapeFactory() {
		return new ShapeFactory();
	}

	public LineFactory getLineFactory() {
		return null;
	}

	public String toString() {
		return "Shape Factory";
	}

	public Shape getShapeInstance(String shapeType) {
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

	public Line getLineInstance(String shapeType) {
		return null;
	}

}
