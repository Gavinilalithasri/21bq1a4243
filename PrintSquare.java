package JAVA;

public class PrintSquare extends Thread{
	int num;
	 PrintSquare(int x){
	 num = x;
	 }
	public void run() {
	 System.out.println("Square of " + num + ": " + num*num);
	 } 


}
