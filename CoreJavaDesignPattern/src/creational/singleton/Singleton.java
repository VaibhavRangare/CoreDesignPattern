package creational.singleton;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {

	}

	public String toString() {
		return "This is Singleton";
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("No Instance yet, creating instance");
			singleton = new Singleton();
		} else {
			System.out.println("Instance already there, returning existing one...");
		}
		return singleton;
	}

	public static void main(String[] args) {

	}

}
