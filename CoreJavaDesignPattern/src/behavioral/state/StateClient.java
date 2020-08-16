package behavioral.state;

public class StateClient {

	public static void main(String[] args) {
		Context ctx = new Context();
		Service service = new Service(ctx);
		service.startService();
		System.out.println(ctx.getcontext());
		service.stopService();
		System.out.println(ctx.getcontext());
	}

}
