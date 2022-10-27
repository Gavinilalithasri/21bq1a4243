package JAVA;

public class NewThread implements Runnable {
	NewThread() {
	   Thread t=new Thread();
	}
	public void run() {
		try {
			for(int i=10;i>5;i--) {
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	

}
