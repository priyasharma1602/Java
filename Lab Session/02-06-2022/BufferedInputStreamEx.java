package corejava;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferedInputStreamEx
{
	
		   public static void main(String args[]) {
			 //Try block to check if exception occurs
		      try {

		         // Suppose, the input.txt file contains the following text
		         // This is a line of text inside the file.
		         FileInputStream file = new FileInputStream("D:\\myfile.txt");
		         
		         // Creates a BufferedInputStream
		         BufferedInputStream buffer = new BufferedInputStream(file);

		         // Returns the available number of bytes
		         System.out.println("Available bytes at the beginning: " + buffer.available());

		         // Reads bytes from the file
		         buffer.read();
		        
		         // Returns the available number of bytes
		         System.out.println("Available bytes at the end: " + buffer.available());

		         buffer.close();
		      }
		    //Catch block to handle if error is occurs
		      catch (Exception e) {
		         e.getStackTrace();
		      }
		   }
}
