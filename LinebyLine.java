package JAVA;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LinebyLine {
	public static void main(String args[]) {
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader("C:/Users/CH/eclipse-workspace/JAVA/src/JAVA/java.txt"));
			String line=reader.readLine();
			while(line!=null) {
				System.out.println(line);
				line=reader.readLine();
			}
			reader.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
