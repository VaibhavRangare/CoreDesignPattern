package structural.proxy;

public class ServiceProxy {
	Service service;
	String type;

	public ServiceProxy(String type) {
		this.type = type;
	}

	public Service runProxy() {
		if (service == null) {
			System.out.println("Service is not up and running..");
			System.out.println("Creating service for client");
			service = new Service();
		} else {
			System.out.println("Service is already up and running");
			System.out.println("Providing existing service...");
		}
		return service;
	}

}
