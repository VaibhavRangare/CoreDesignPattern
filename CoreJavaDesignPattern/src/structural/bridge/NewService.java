package structural.bridge;

public class NewService implements NewInterface {
	ExistingInterface eint;

	@Override
	public void newMethod() {
		eint = new ClientService();
		System.out.println("Using new interface calling existing service methods");
		eint.oldMethod();
	}

}
