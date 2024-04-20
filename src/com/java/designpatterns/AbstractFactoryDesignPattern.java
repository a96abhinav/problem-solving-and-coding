package com.java.designpatterns;

interface Employeee {
	int getSalary();
}

class AndroidDeveloper implements Employeee {

	public AndroidDeveloper() {
		System.out.println("I am an Android Developer.");
	}

	@Override
	public int getSalary() {
		return 80000;

	}

}

class WebDeveloper implements Employeee {

	public WebDeveloper() {
		System.out.println("I am a Web Developer.");
	}

	@Override
	public int getSalary() {
		return 60000;

	}

}

abstract class EmployeeAbstractFactory {
	public abstract Employeee createEmployee();
}

class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employeee createEmployee() {
		return new AndroidDeveloper();
	}

}

class WebDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employeee createEmployee() {
		return new WebDeveloper();
	}

}

class EmployeeeFactory {
	public static Employeee getEmployeee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {

		Employeee employee = EmployeeeFactory.getEmployeee(new WebDevFactory());
		System.out.println(employee.getSalary());
		
		Employeee employee02 = EmployeeeFactory.getEmployeee(new AndroidDevFactory());
		System.out.println(employee02.getSalary());
	}
}
