package com.java.practice;

class AutoCloseableResourcesFirst implements AutoCloseable {

    public AutoCloseableResourcesFirst() {
        System.out.println("Constructor -&gt; AutoCloseableResources_First");
    }

    public void doSomething() {
        System.out.println("Something -&gt; AutoCloseableResources_First");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_First");
    }
}

class AutoCloseableResourcesSecond implements AutoCloseable {

    public AutoCloseableResourcesSecond() {
        System.out.println("Constructor -&gt; AutoCloseableResources_Second");
    }

    public void doSomething() {
        System.out.println("Something -&gt; AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_Second");
    }
}

public class TryWithResources {

	public static void main(String[] args) throws Exception {
		orderOfClosingResources();

	}
	
	private static void orderOfClosingResources() throws Exception {
	    try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
	        AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

	        af.doSomething();
	        as.doSomething();
	    }
	}

}
