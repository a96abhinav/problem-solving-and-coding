package com.java.designpatterns;

interface Gpu{
	public void createGpu();
}

class HpGpu implements Gpu{
	@Override
	public void createGpu() {
		System.out.println("Created HP GPU.");
	}
}

class DellGpu implements Gpu{
	@Override
	public void createGpu() {
		System.out.println("Created Dell GPU.");
	}
}

interface Monitor{
	public void createMonitor();
}

class HpMonitor implements Monitor{
	@Override
	public void createMonitor() {
		System.out.println("Created HP Monitor.");
	}
}

class DellMonitor implements Monitor{
	@Override
	public void createMonitor() {
		System.out.println("Created Dell Monitor.");
	}
}

abstract class Manufacturer {
	public abstract Gpu getGpu();
	public abstract Monitor getMonitor();
}

class HpManufacturer extends Manufacturer {

	@Override
	public Gpu getGpu() {
		return new HpGpu();
	}

	@Override
	public Monitor getMonitor() {
		return new HpMonitor();
	}
}

class DellManufacturer extends Manufacturer {

	@Override
	public Gpu getGpu() {
		return new DellGpu();
	}

	@Override
	public Monitor getMonitor() {
		return new DellMonitor();
	}
}

public class AbstractFactoryDesignPattern2 {

	public static void main(String[] args) {
		Manufacturer dellManufacturer = new DellManufacturer();
		dellManufacturer.getGpu().createGpu();
		dellManufacturer.getMonitor().createMonitor();

		Manufacturer hpManufacturer = new HpManufacturer();
		hpManufacturer.getGpu().createGpu();
		hpManufacturer.getMonitor().createMonitor();
	}
}
