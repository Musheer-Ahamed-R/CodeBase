public class Application {

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		q.enque(60);
		q.enque(70);
		q.enque(80);
		q.enque(90);
		q.enque(100);
		q.enque(10000);
		q.printQueue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.printQueue();
		q.enque(70);
		q.enque(80);
		q.printQueue();
	}
}