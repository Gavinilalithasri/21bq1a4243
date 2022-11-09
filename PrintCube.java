package JAVA;

public class PrintCube extends Thread {
	int num;
	 PrintCube(int x){
	 num = x;
	 }
	public void run() {
	 System.out.println("Cube of " + num + ": " + num*num*num);
	 }

}
