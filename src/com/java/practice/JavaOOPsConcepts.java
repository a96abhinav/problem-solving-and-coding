package com.java.practice;

//Driver class with driver's name and Drive
//functionality
import java.util.Scanner;

class Driver {
	private String name;
	private int license;
	private int mobile;

	public Driver() {
		this.name = "Car Owner";
		this.license = 11111;
		this.mobile = 11111;
	}

	public void drive() {
		System.out.println("Drive started..." + "Have a nice drive!");
	}

	public void profile(String name) {
		this.name = name;
	}

	public void profile(String name, int license) {
		this.name = name;
		this.license = license;
	}

	public void profile(String name, int license, int mobile) {

		this.name = name;
		this.license = license;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

// Car class aggregated with driver and
// composed with in built feature beverages
// Tea and Coffee.
class Car {
	Driver driver;
	Beverages b;
	String carChoice;

	Car() {
		this.carChoice = "SUV";
	}

	Car(String carChoice) {
		this.carChoice = carChoice;
	}

	void GetInTheCar(Driver driver) {
		System.out.println("Hey " + driver.getName() + " Enjoy driving with your " + this.carChoice + " Car");
		driver.drive();
	}

	void EnjobyBeverages() {
		System.out.println("Want Beverage?" + " Enter 1 for Tea/ 2 for Coffee!");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1) {
			b = new Tea();
		}
		if (choice == 2) {
			b = new Coffee();
		}
		b.getBeverage();
	}
}

// Beverages abstract class and
// 2 subclasses Tea and Coffee.
abstract class Beverages {
	private void addHotWater() {
		System.out.println("Adding hot water");
	}

	private void addMilk() {
		System.out.println("Adding hot milk");
	}

	private void addSugar() {
		System.out.println("Adding Sugar");
	}

	public void getMixture() {
		System.out.println("Your Beverage is " + "getting ready...");

		addHotWater();
		addMilk();
		addSugar();
	}

	public abstract void getBeverage();

	public abstract void addIngredients();
}

// Interface to enforce subclasses to implement
// cleaning tea and coffee pot.
interface Clean {
	void cleanPot();
}

class Tea extends Beverages implements Clean {
	@Override
	public void addIngredients() {
		System.out.println("Tea Bag added");
	}

	@Override
	public void getBeverage() {
		cleanPot();
		getMixture();
		addIngredients();
		System.out.println("Tea's Ready! Enjoy");
	}

	@Override
	public void cleanPot() {
		System.out.println("Cleaning tea pot...");
	}
}

class Coffee extends Beverages implements Clean {
	@Override
	public void addIngredients() {
		System.out.println("Coffee Bag added");
	}

	@Override
	public void getBeverage() {
		cleanPot();
		getMixture();
		addIngredients();
		System.out.println("Coffee's Ready! Enjoy");
	}

	@Override
	public void cleanPot() {
		System.out.println("Cleaning Coffee pot...");
	}
}

// SAMPLE CLIENT PROGRAM
public class JavaOOPsConcepts {
	public static void main(String[] args) {
		System.out.println("Welcome for a nice Drive!");
		Scanner s = new Scanner(System.in);
		Driver driver = new Driver();
		driver.profile("peter");
		Car c;
		System.out.println("Want to Choose Car? " + "Press 0 for NO / 1 for YES");

		int carType = s.nextInt();
		if (carType == 1) {
			System.out.println("Enter Car name...");
			String carName = s.next();
			c = new Car(carName);
		} else {
			c = new Car();
		}
		c.GetInTheCar(driver);
		c.EnjobyBeverages();
	}
}