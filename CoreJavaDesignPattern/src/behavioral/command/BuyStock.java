package behavioral.command;

public class BuyStock implements Command {
	Stock stock ;
	@Override
	public void execute() {
		stock.buy();

	}

	public BuyStock(Stock stock){
		this.stock = stock;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
