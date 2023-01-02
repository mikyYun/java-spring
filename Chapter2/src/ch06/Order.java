package ch06;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

	String orderId;
	String orderAddress;
	int clientPhoneNumber;
	LocalDate orderDate;
	LocalTime orderTime;
	int orderPrice;
	int orderNumber;
	
	public Order() {}
	
	public Order(
			String orderId,
			String orderAddress,
			int clientPhoneNumber,
			int orderPrice,
			int orderNumber
			) {
		
		
		this.orderId = orderId;
		this.orderAddress = orderAddress;
		this.clientPhoneNumber = clientPhoneNumber;
		this.orderDate = LocalDate.now();
		this.orderTime = LocalTime.now();
		this.orderPrice = orderPrice;
		this.orderNumber = orderNumber;
	}
	
	public String showOrderInfo() {
		return (
				"OrderID: " + orderId + 
				"\nOrder Address: " + orderAddress +
				"\nClient Phone Number: " + clientPhoneNumber +
				"\nOrder Date: " + orderDate + 
				"\nOrder Time: " + orderTime + 
				"\nOrder Price: " + orderPrice +
				"\nOrder Number: " + orderNumber
				);
	}
}
