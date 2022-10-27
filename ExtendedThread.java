package JAVA;

public class ExtendedThread {
	public static void main(String args[]) {
		New t=new New();
		t.start();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("main thread:"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("main interrupted");
		}
		System.out.println("exiting main thread");
	
	}

}
