package com.java.practice;
import java.util.*;

class Customer implements Comparable<Customer> {

	private String name;
	private int empId;
	private long salary;

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public long getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Customer(String name, int empId, long salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}




	//public int hashCode() { return 1; }




	@Override public int compareTo(Customer o) {

		if(empId > o.empId) { return 1; }else if(empId < o.empId) { return -1; }else
		{ return 0; }

	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * Customer e = (Customer)obj;
	 * 
	 * Integer id = e.empId; Integer id1= this.empId;
	 * 
	 * return id.equals(id1); }
	 * 
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * this.empId; }
	 */

}


public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Customer> queue = new PriorityQueue<>();

		
		
		Customer e1 = new Customer ("abd", 13, 20000);
		Customer e2 = new Customer ("abc", 155, 20000);
		Customer e3 = new Customer ("xyz", 14, 40000);
		Customer e4 = new Customer ("abd", 456, 20000);
		Customer e5 = new Customer ("abc", 545, 20000);
		Customer e6 = new Customer ("xyz", 23, 40000);
		
		queue.offer(e1);
		queue.offer(e2);
		queue.offer(e3);
		queue.offer(e4);
		queue.offer(e5);
		queue.offer(e6);
		
		//System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
