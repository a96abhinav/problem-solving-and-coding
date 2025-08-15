package com.java.designpatterns.structural;

interface Image {
	void display();
}

class RealImage implements Image {
	private final String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading image: " + filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + filename);
	}
}

class ProxyImage implements Image {
	private RealImage realImage;

	public ProxyImage(String filename) {
		this.realImage = new RealImage(filename);
	}

	@Override
	public void display() {
		realImage.display();
	}
}

public class ProxyDesignPattern {
	public static void main(String[] args) {
		Image image = new ProxyImage("high_res_photo.jpg");

		System.out.println("Image object created.");
		image.display(); // Loads and displays
		image.display(); // Just displays
	}
}
