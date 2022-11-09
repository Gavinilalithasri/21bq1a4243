package JAVA;
import java.io.File;
public class FileOperations {
	public static void main(String[] args) {
		 File f = new File("src\\Hello.java");
		 if(f.exists()) {
		 String S = (f.exists())?"Exists":"DOESN'T Exist";
		 System.out.println("File : " + S);

		 String read = (f.canRead())?"Yes":"No";
		 System.out.println("Readable : " + read);

		 String write = (f.canWrite())?"Yes":"No";
		 System.out.println("Writable : " + write);

		 int index = f.getName().lastIndexOf(".");
		 String extension = f.getName().substring(index);
		 System.out.println("Type Of File : " + extension);

		 System.out.println("Length Of File : " + f.length() + "bytes");
		 }
		 else {
		 System.out.println("File Doesn't Exist");
		 }
		 }

}
