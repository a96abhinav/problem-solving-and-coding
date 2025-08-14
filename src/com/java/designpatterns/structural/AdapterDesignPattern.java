package com.java.designpatterns.structural;

interface IphoneCharger {
	public void chargeIphone();
}

class AmazonIphoneCharger implements IphoneCharger {
	@Override
	public void chargeIphone() {
		System.out.println("Started Charging Iphone.");
	}
}

interface SamsungCharger {
	public void chargeSamsungPhone();
}

class AmazonSamsungCharger implements SamsungCharger {
	@Override
	public void chargeSamsungPhone() {
		System.out.println("Started Charging Samsung Phone.");
	}
}

class SamsungToIphoneAdapter implements IphoneCharger{
	private final SamsungCharger samsungCharger;

	public SamsungToIphoneAdapter(SamsungCharger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}

	@Override
	public void chargeIphone() {
		samsungCharger.chargeSamsungPhone();
		System.out.println("Samsung charger doesn't natively support iPhone.");
		System.out.println("Charging Iphone using Samsung Charger using Iphone Adapter");
	}
}

public class AdapterDesignPattern {
	public static void main(String[] args) {
		SamsungCharger samsungCharger = new AmazonSamsungCharger();
		IphoneCharger iphoneCharger = new SamsungToIphoneAdapter(samsungCharger);
		iphoneCharger.chargeIphone();
	}
}
