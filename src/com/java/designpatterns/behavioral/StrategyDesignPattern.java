package com.java.designpatterns.behavioral;

interface PaymentStrategy {
	void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
	private String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid Rs " + amount + " using Credit Card: " + cardNumber);
	}
}

class PayPalPayment implements PaymentStrategy {
	private String email;

	public PayPalPayment(String email) {
		this.email = email;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid Rs " + amount + " using PayPal account: " + email);
	}
}

class ShoppingCart {
	private int total;

	public void addItem(int price) {
		total += price;
	}

	public void checkout(PaymentStrategy strategy) {
		strategy.pay(total);
	}
}

public class StrategyDesignPattern {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(500);
		cart.addItem(1500);

		PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
		cart.checkout(creditCard);

		PaymentStrategy paypal = new PayPalPayment("user@example.com");
		cart.checkout(paypal);
	}

}

