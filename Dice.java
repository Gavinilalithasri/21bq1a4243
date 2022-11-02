package JAVA;
import java.lang.Math;
public class Dice {
	public static void main(String args[]) {
		int a[]=new int[7];
		for(int i=1;i<=10000;i++) {
			int n=(int)(1+Math.random()*6);
			int m=(int)(1+Math.random()*6);
			if(m==n) {
				a[m]++;
			}
		}
		for(int k=1;k<a.length;k++) {
			System.out.println("number of"+k+","+k+"that have occured:"+a[k]);
			
		}
	}

}
