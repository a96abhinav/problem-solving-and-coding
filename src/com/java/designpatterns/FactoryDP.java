package com.java.designpatterns;

interface Employee {
	public int getSalary();
}

class AndroidDev implements Employee {

	public AndroidDev() {
		System.out.println("I am an Android Developer");
	}

	@Override
	public int getSalary() {
		return 90000;
	}
}

class WebDev implements Employee {

	public WebDev() {
		System.out.println("I am an Web Developer");
	}

	@Override
	public int getSalary() {
		return 50000;
	}
}

class EmployeeFactory {

	public static Employee getEmployee(String type) {
		if (type.trim().equalsIgnoreCase("Android Dev")) {
			return new AndroidDev();
		} else if (type.trim().equalsIgnoreCase("Web Dev")) {
			return new WebDev();
		} else {
			System.out.println("No employee class exists for given type!");
			return null;
		}
	}
}

public class FactoryDP {

	public static void main(String[] args) {

		Employee employee = EmployeeFactory.getEmployee("Android Dev");

	}

}
