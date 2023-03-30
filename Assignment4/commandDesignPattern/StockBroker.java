package commandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
	private List<Order> orderList = new ArrayList<Order>();

	public void placeOrder(Order order) {
		orderList.add(order);
	}
 
	public void executeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
