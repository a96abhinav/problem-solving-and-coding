package com.java.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

interface Channel{
	void subscribe(Subscriber subscriber);
	void unSubscribe(Subscriber subscriber);
	void uploadNewVideo(String title);
}

interface Subscriber{
	void notify(String title);
}

class YoutubeChannel implements Channel{

	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	@Override
	public void unSubscribe(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}

	@Override
	public void uploadNewVideo(String title) {
		for(Subscriber subscriber:subscribers){
			subscriber.notify(title);
		}
	}
}

class YoutubeSubscriber implements Subscriber{

	String name;

	YoutubeSubscriber(String name){
		this.name = name;
	}

	@Override
	public void notify(String title) {
		System.out.println("Hello "+name+", new video uploaded : "+title);
	}
}

public class ObserverDesignPattern {
	public static void main(String[] args) {
		YoutubeChannel channel1 = new YoutubeChannel();

		Subscriber abhinav = new YoutubeSubscriber("Abhinav");
		Subscriber alok = new YoutubeSubscriber("Alok");

		channel1.subscribe(abhinav);
		channel1.subscribe(alok);

		channel1.uploadNewVideo("Learning Design Patterns in Java.");

		channel1.unSubscribe(alok);

		channel1.uploadNewVideo("Learning Data Structures in Java.");
	}
}
