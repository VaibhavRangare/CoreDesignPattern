package creational.abstractfactor;

public class DottedLine implements Line {

	public void draw() {
		System.out.println("Dreawing Dotted Line...");
	}

	public String toString() {
		return "Dotted Line";
	}

}
