package com.java.designpatterns.creational;

import java.util.ArrayList;
import java.util.List;

class NetworkConnection implements Cloneable {
	private String ip = "127.0.0.1";
	private List<String> urls = new ArrayList<String>();

	public String getIp() {
		return ip;
	}

	public List<String> getUrls() {
		return urls;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public void loadUrls() throws InterruptedException {
		Thread.sleep(5000);
		this.urls.add("aaa.com");
		this.urls.add("bbb.com");
		this.urls.add("ccc.com");
		this.urls.add("ddd.com");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		//using Deep Copy for object cloning
		
		NetworkConnection connection = new NetworkConnection();
		connection.setIp(this.getIp());
		
		for(String url : this.urls) {
			connection.getUrls().add(url);
		}
		
		return connection;
	}
}

public class PrototypeDesignPattern {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		NetworkConnection conn = new NetworkConnection();
		conn.loadUrls();
		
		NetworkConnection conn2 = (NetworkConnection) conn.clone();
		
		conn.getUrls().remove(0);
		
		System.out.println(conn.getIp());
		System.out.println(conn.getUrls());	
		
		System.out.println(conn2.getIp());
		System.out.println(conn2.getUrls());

	}

}
