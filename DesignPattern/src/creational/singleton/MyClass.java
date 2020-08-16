package creational.singleton;
/* 
 * 
 * */
public class MyClass {
	public static final MyClass myInstance = new MyClass();
	private MyClass() {
		System.out.println("Creating Instance");
	}
	public static MyClass getInstance() {
		return myInstance;
	}
}
