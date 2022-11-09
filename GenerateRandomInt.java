package JAVA;
import java.util.Random;
public class GenerateRandomInt extends Thread {
		 Random R = new Random();
		public void run() {
		 for(int i=0;i<10;i++) {
		 int num = 1 + R.nextInt(20); // From 1 to 20
		 PrintSquare PS = new PrintSquare(num);
		 PrintCube PC = new PrintCube(num);
		 if(num%2==0) {
		 PS.start();
		 }
		 else {
		 PC.start();
		 }
		 try {
		 sleep(1000); // sleeps for 1 sec
		 }
		 catch(InterruptedException e) {
		 System.out.println("Exception Caught");
		 }
   }
} 
}

