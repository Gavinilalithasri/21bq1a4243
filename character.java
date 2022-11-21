package JAVA;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class character {
	public static void main(String[] args) throws IOException 
	   {
	      File f=new File("C:/Users/CH/eclipse-workspace/JAVA/src/JAVA/java.txt") ;
	      FileReader fr=new FileReader(f);  
	      BufferedReader br=new BufferedReader(fr);  
	      int c = 0;             
	      while((c = br.read()) != -1)        
	      {
	            char character = (char) c;          
	            System.out.println(character);        
	      }
	      
	   }

}
