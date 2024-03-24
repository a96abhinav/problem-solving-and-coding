package com.java.designpatterns;

class SingletonClass {

	private static SingletonClass singleton;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (singleton == null) {
			synchronized (SingletonClass.class) {
				if (singleton == null) {
					singleton = new SingletonClass();
				}
			}
		}
		return singleton;
	}

}

public class SingletonDP {
	public static void main(String[] args) {

		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		SingletonClass s3 = SingletonClass.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		if (s1 == s2) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

	}
}
