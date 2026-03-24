package com.test.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		Queue q = new PriorityBlockingQueue<>();
		q.add(2);
		q.add(1);
		Iterator<Integer> itr=q.iterator();
		if(itr.hasNext()) {
			int i=itr.next();
			//System.out.println(i);
			
		}
		
		Queue q2 = new PriorityQueue<>();
		q2.add(2);	
		q2.add(1);
//		Iterator<Integer> itr2=q2.iterator();
//		if(itr2.hasNext()) {
//			//System.out.println(itr.next());
//			
//		}
//		while (!q2.isEmpty()) {
//            // poll() retrieves and removes the head (highest priority element)
//            System.out.print(q2.peek() + " "); //
//        }
		System.out.println(q2);
		System.out.println(q2.poll());
		System.out.println(q2);
		
	}

}
