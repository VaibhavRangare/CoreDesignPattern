package creational.abstractfactor;

public abstract class AFactory {

	public abstract LineFactory getLineFactory();

	public abstract ShapeFactory getShapeFactory();

	public abstract Line getLineInstance(String shapeType);

	public abstract Shape getShapeInstance(String shapeType);

}
