import java.util.*;
public class Queue {

	public int[] queue;
	public int front = -1;
	public int rear = -1;
	//public int capacity;

	public Queue(int queueSize) {
		this.queue = new int[queueSize];
		//this.capacity = capacity;
	}

	public void enque(int data) {

		if((this.rear + 1)%this.queue.length == this.front) {
			System.out.println("The Queue is Full");
			return;
		}
		if(this.front == -1 && this.rear == -1) {
			this.front = (this.front + 1)%this.queue.length;
			this.rear = (this.rear + 1)%this.queue.length;
		} else {
			this.rear = (this.rear + 1)%this.queue.length;
		}
		this.queue[rear] = data;
	}

	public void dequeue() {

		if(this.front == -1 && this.rear == -1) {
			System.out.println("The Queue is Empty");
			return;
		}
		if(this.front == this.rear) {
			this.front = -1;
			this.rear = -1;
		} else {
			this.front = (this.front + 1)%this.queue.length;
		}
	}

	public void printQueue(){

		for(int i=this.front;i!=this.rear;i = (i+1)%this.queue.length) {
			System.out.print(this.queue[i]+"  ");
		}
		if(this.rear != -1) {
			System.out.println(this.queue[this.rear]);
		}
	}
}