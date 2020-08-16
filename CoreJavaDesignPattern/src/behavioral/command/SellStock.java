package behavioral.command;

public class SellStock implements Command {
	Stock stock ;
	@Override
	public void execute() {
		stock.sell();

	}
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
