package JAVA;
import java.io.*;
import java.io.PipedWriter;
import java.io.PipedReader;
public class FibPrimeTest {
	public static void main (String[] args)throws IOException {
		 Fibonacci F = new Fibonacci();
		 Prime P = new Prime();
		 Receiver R = new Receiver(F,P);
		 F.start();
		 P.start();
		 R.start();
		 } 


}
