package JAVA;
import java.util.*;

public class DemoTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 dim:");
		int a=sc.nextInt();
		System.out.println("enter 2 dim:");
		int b=sc.nextInt();
		Rectangle r=new Rectangle();
		r.printArea(a, b);
		Triangle t=new Triangle();
		t.printArea(a, b);
		Circle c=new Circle();
		c.printArea(a, b);
		
	}

}
