import java.util.*;

public class StackArray {

	// Here in this case, the Capacity is the Size of the Array.

	public int[] stack;
	public int top = -1;

	public StackArray(int size) {
		this.stack = new int[size];
	}

	public void push(int item) {
		if(this.top >= this.stack.length-1) {
			System.out.println("Unable to Add. Stack Overflow");
			return;
		}
		this.stack[++this.top] = item;
	} 

	public int pop() {
		if(this.top < 0) {
			System.out.println("Cannot Pop Item. Stack UnderFlow");
			return -1;
		}
		return this.stack[this.top--];
	}

	public int peek() {
		if(this.top < 0) {
			System.out.println("The Stack is Empty");
			return -1;
		}
		return this.stack[this.top];
	}

	public void print() {

		for(int i=0;i<=top;i++) {
			System.out.print(this.stack[i]+"  ");	
		}
		System.out.println();
	}

}