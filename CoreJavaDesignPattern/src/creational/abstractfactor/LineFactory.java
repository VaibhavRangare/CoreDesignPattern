package creational.abstractfactor;

public class LineFactory extends AFactory {

	public LineFactory getLineFactory() {
		return new LineFactory();
	}

	public ShapeFactory getShapeFactory() {
		return null;
	}

	public String toString() {
		return "Line Factory";
	}

	public Line getLineInstance(String shapeType) {
		Line line = null;
		if (shapeType.equals("solidline")) {
			line = new SolidLine();
		}
		if (shapeType.equals("dottedline")) {
			line = new DottedLine();
		}
		return line;
	}

	public Shape getShapeInstance(String shapeType) {
		return null;
	}

}
