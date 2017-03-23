
// We need to implement a Stack data structure using only instances of Queue and queue operations allowed on the instances.

// Using two Queues
// 1 -> making Pop Costly
// 2 -> making push costly


import java.util.*;

// Using Two Queue and making Pop constly
public class ImplementStackUsingQueue {

	
	Queue<Integer> q1 = new ArrayDeque<>();
	Queue<Integer> q2 = new ArrayDeque<>();

	public void push(int data) {
		q1.add(data);
	}	


	public int pop() {
		int data = Integer.MIN_VALUE;
		while(!q1.isEmpty()) {
			data = q1.remove();
			if(!q1.isEmpty()) {
				q2.add(data);
			} else {
				System.out.println(data);
			}
		}
		swapQueue();
		return data;
	}

	public void swapQueue() {
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

}

// Using Two Queue and making Pop constly
class ImplementStackUsingQueue2 {

	Queue<Integer> q1 = new ArrayDeque<>();
	Queue<Integer> q2 = new ArrayDeque<>();

	public void push(int data) {
		
		q2.add(data);
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		swapQueue();
	}	


	public void pop() {
		if(!q1.isEmpty()) {
			System.out.println("Hello "+q1.remove());
		} else {
			System.out.println("Stack is empty");
		}		
	}

	public void swapQueue() {
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}


}

// Using Single Queue and making Pop constly
class ImplementStackUsingQueue3 {

	Queue<Integer> q1 = new ArrayDeque<>();

	public void push(int data) {

		q1.add(data);
	}	


	public void pop() {
		if(!q1.isEmpty()) {
			int length = q1.size();
			for(int i=0;i<length-1;i++) {
				q1.add(q1.remove());	
			}
			System.out.println("Hello "+q1.remove());
		} else {
			System.out.println("Stack is empty");
		}		
	}

}

// Using Single Queue and making Push constly
class ImplementStackUsingQueue4 {

	Queue<Integer> q1 = new ArrayDeque<>();

	public void push(int data) {

		int length = q1.size();
		q1.add(data);
		for(int i=0;i<length;i++) {
			q1.add(q1.remove());	
		}

	}	


	public void pop() {
		if(!q1.isEmpty()) {
			System.out.println("Hello "+q1.remove());
		} else {
			System.out.println("Stack is empty");
		}		
	}

}