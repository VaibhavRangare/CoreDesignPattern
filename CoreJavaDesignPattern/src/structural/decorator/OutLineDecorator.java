package structural.decorator;

public class OutLineDecorator implements Shape {
	Shape shape;

	@Override
	public void draw() {
		shape.draw();
		blueOutLine();
	}

	public OutLineDecorator(Shape s) {
		this.shape = s;
	}

	public void blueOutLine() {
		System.out.println("Decorating with Blue Line");
	}

}
