package structural.bridge;

public class BridgeClient {

	public static void main(String[] args) {
		NewInterface nint = new NewService();
		nint.newMethod();
	}

}
