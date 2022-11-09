package JAVA;

public class Consumer extends Thread {
	ItemQueue itemQueue;
	 Consumer(ItemQueue itemQueue){
	 this.itemQueue = itemQueue;
	 new Thread(this,"Consumer").start();
	 }
	public void run() {
	 while(true) {
	 itemQueue.getItem();
	 }
	 }

}
