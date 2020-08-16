package behavioral.command;

public class StockBrocker {

	/**
	 * @param args
	 */
	public void stockOperations(Stock stock){
		Command buy = new BuyStock(stock);
		buy.execute();
		Command sell = new SellStock(stock);
		sell.execute();
	}
	public static void main(String[] args) {
		Stock s = new Stock();
		StockBrocker sb = new StockBrocker();
		sb.stockOperations(s);

	}

}
