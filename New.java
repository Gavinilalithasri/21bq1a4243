package JAVA;

public class New  extends Thread{
	New(){
		super("Demo Thread");
		System.out.println("child thread:"+this);
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("child thread:"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("child interrupted");
		}
		System.out.println("exiting child thread");
	}

}
