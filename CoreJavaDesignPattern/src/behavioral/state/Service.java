package behavioral.state;

public class Service {
	Context ctx;

	public Service(Context ctx) {
		this.ctx = ctx;
	}

	public void startService() {
		ctx.setContext("Service Starting ...");
	}

	public void stopService() {
		ctx.setContext("Service Stopping ...");
	}

}
