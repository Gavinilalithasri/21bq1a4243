package JAVA;

public class ThreadDemo {
	public static void main(String args[]) {
		NewThread nt=new NewThread();
		try {
			for(int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(500);
				nt.t.start();
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
