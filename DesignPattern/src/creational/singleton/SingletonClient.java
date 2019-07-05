package creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass instance = MyClass.getInstance();
		instance = MyClass.getInstance();
	}

}
