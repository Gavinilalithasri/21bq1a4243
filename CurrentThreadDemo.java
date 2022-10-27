package JAVA;

public class CurrentThreadDemo {
	public static void main(String args[]) {
		Thread t=Thread.cuurentThread();
		System.out.println("curent Thread:"+t);
		t.setName("My Thread");
		System.out.println("after name change:"+t);
		try {
			for(int n=5;n>0;n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
	}

}
