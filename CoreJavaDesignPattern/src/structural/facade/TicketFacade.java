package structural.facade;

public class TicketFacade {

	public void bookTicket() {
		OrderTicket or = new OrderTicket();
		or.placeOrder();
		DispatchTicket dt = new DispatchTicket();
		dt.dispatchTicket();
	}

}
