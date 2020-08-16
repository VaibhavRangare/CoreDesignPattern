package structural.bridge;

public class ClientService implements ExistingInterface {

	@Override
	public void oldMethod() {
		System.out.println("Executing old method for Client");

	}

}
