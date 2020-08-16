package structural.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		Shape s = new OutLineDecorator(new Circle());
		s.draw();
	}

}
