package creational.abstractfactor;

public class SolidLine implements Line {

	public void draw() {
		System.out.println("Dreawing Solid Line...");
	}

	public String toString() {
		return "Solid Line";
	}

}
