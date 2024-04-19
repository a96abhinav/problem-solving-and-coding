package com.java.practice;
import java.util.PriorityQueue;

public class PriorityQueueEx02 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b)->b.compareTo(a));
		
		q.offer(44);
		q.offer(32);
		q.offer(65);
		q.offer(866);
		q.offer(654);
		q.offer(89);
		q.offer(9);
		q.offer(76);
		q.offer(56);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
