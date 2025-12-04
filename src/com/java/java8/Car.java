package com.java.java8;

import java.util.Arrays;
import java.util.List;

public class Car {

	private String brand;
	private String model;
	private int year;
	private double price;
	private String fuelType;     // Petrol, Diesel, EV, Hybrid
	private int mileage;         // km/l or range for EV
	private String color;
	private boolean automatic;

	public Car(String brand, String model, int year, double price,
			   String fuelType, int mileage, String color, boolean automatic) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.color = color;
		this.automatic = automatic;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	@Override
	public String toString() {
		return brand + " " + model + " (" + year + ") | Price: " + price;
	}

	// Sample Data
	public static List<Car> getSampleCars() {
		return Arrays.asList(
				new Car("Toyota", "Fortuner", 2022, 3800000, "Diesel", 12, "White", true),
				new Car("Honda", "City", 2020, 1400000, "Petrol", 17, "Grey", false),
				new Car("Hyundai", "Creta", 2023, 1800000, "Petrol", 16, "Red", true),
				new Car("Tata", "Nexon EV", 2024, 1700000, "EV", 320, "Blue", true),
				new Car("Mahindra", "Thar", 2021, 1900000, "Diesel", 10, "Black", false),
				new Car("Maruti", "Baleno", 2019, 900000, "Petrol", 21, "Blue", false),
				new Car("Kia", "Seltos", 2022, 1600000, "Diesel", 18, "White", true),
				new Car("BMW", "X1", 2021, 4500000, "Petrol", 14, "Black", true),
				new Car("Audi", "Q3", 2020, 5200000, "Petrol", 13, "Grey", true),
				new Car("Mercedes", "GLA", 2023, 6000000, "Diesel", 12, "White", true),
				new Car("Skoda", "Slavia", 2022, 1500000, "Petrol", 19, "Red", false),
				new Car("Volkswagen", "Taigun", 2023, 1600000, "Petrol", 18, "Yellow", true),
				new Car("MG", "Hector", 2021, 1750000, "Diesel", 15, "Silver", true),
				new Car("Jeep", "Compass", 2022, 3000000, "Diesel", 14, "Green", false),
				new Car("Renault", "Kiger", 2021, 900000, "Petrol", 20, "Blue", false),
				new Car("Nissan", "Magnite", 2021, 850000, "Petrol", 20, "Red", false),
				new Car("Tesla", "Model 3", 2024, 4500000, "EV", 450, "White", true),
				new Car("Volvo", "XC40", 2023, 5500000, "Petrol", 12, "Black", true),
				new Car("Hyundai", "Verna", 2020, 1200000, "Petrol", 20, "Grey", false),
				new Car("Tata", "Harrier", 2022, 2100000, "Diesel", 15, "Dark Blue", true)
		);
	}

}
