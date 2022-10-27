package JAVA;

public class NewThread implements Runnable {
	String name;
	Thread t;
	NewThread(String threadname) {
		name=threadname;
	    t=new Thread(this,name);
	    System.out.println("new thread:"+t);
	}
	public void run() {
		try {
			for(int i=10;i>5;i--) {
				System.out.println(name+";"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(name+"interrupted");
		}
		System.out.println(name+"exiting");
	}
	

}
