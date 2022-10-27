package JAVA;

public class MultiThreadDemo {
	public static void main(String args[]) {
		NewThread nt1=new NewThread("one");
		NewThread nt2=new NewThread("two");
		NewThread nt3=new NewThread("three");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("main thread interuupted");
			
		}
		System.out.println("main thread exiting");
		
	}


}
