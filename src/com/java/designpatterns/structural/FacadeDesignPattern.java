package com.java.designpatterns.structural;

class InventoryService {
	public void checkStock(String item) {
		System.out.println("Checking stock for: " + item);
	}
}

class PaymentService {
	public void processPayment(String item) {
		System.out.println("Processing payment for: " + item);
	}
}

class NotificationService {
	public void sendConfirmation(String item) {
		System.out.println("Sending confirmation for: " + item);
	}
}

class OrderFacade {
	private final InventoryService inventoryService = new InventoryService();
	private final PaymentService paymentService = new PaymentService();
	private final NotificationService notificationService = new NotificationService();

	public void placeOrder(String item) {
		inventoryService.checkStock(item);
		paymentService.processPayment(item);
		notificationService.sendConfirmation(item);
		System.out.println("Order placed successfully for: " + item);
	}
}

public class FacadeDesignPattern {
	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.placeOrder("MacBook Pro");
	}

}
