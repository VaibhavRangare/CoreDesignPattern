package creational.prototype;

public class Client {

	public static void main(String[] args) {
		ComplexObject co = new ComplexObject("John", "CS", 23, "US");

		System.out.println(co);
		try {
			ComplexObject co1 = (ComplexObject) co.clone();
			System.out.println(co1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
