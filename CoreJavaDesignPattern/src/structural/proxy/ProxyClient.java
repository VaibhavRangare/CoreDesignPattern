package structural.proxy;

public class ProxyClient {

	public static void main(String[] args) {
		ServiceProxy sp = new ServiceProxy("service");
		Service s = sp.runProxy();
		s.provideService();
		Service s1 = sp.runProxy();
		s1.provideService();
	}

}
