package creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		s = Singleton.getInstance();
		System.out.println(s);
	}

}
