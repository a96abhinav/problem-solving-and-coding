package com.java.designpatterns.structural;

interface Pizza {
	int cost();
}

class PeppyPaneerPizza implements Pizza {
	@Override
	public int cost() {
		return 249;
	}
}

class VegExtraveganzaPizza implements Pizza {
	@Override
	public int cost() {
		return 299;
	}
}

interface PizzaToppings extends Pizza {
}

class ExtraCheeseTopping implements PizzaToppings {
	private final Pizza pizza;

	ExtraCheeseTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return this.pizza.cost()+50;
	}
}

class ExtraMushroomTopping implements PizzaToppings {
	private final Pizza pizza;

	ExtraMushroomTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return this.pizza.cost()+25;
	}
}

public class DecoratorDesignPattern {
	public static void main(String[] args) {
		Pizza peppyPaneerPizza = new ExtraMushroomTopping(new ExtraCheeseTopping(new PeppyPaneerPizza()));
		System.out.println("Total amount to pay : " + peppyPaneerPizza.cost());
	}
}
