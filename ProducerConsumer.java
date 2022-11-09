package JAVA;

public class ProducerConsumer {
	public static void main(String args[]) {
		 ItemQueue itemQueue = new ItemQueue();
		 new Producer(itemQueue);
		 new Consumer(itemQueue);
		 }

}
