package file;
import java.io.*;
public class Demo {
	
	public static void main (String []arge) {
		
		try {
			File n=new File ("C:\\Users\\pawar\\OneDrive");
			if (n.createNewFile()) {
				System.out.println("file successfully");
			}
			else {
				System.out.println("file already exist");
			}
			
		}
		catch (Exception e){
			System.out.println("Exception handel");
			
		}
	}

}