package corejava;
//Java program to create a file in Java using Exception Handling

import java.io.FileOutputStream;

public class ExceptionHandlingEx
{
   public static void main(String args[])
	{ 
	   //Try block to check if exception occurs
		try
		{ 
	    //Creating an output stream object to create a file
		FileOutputStream fout=new FileOutputStream("D:\\myfile.txt");
		//Writing into the file
		String s = "MyFile is created and no Exception occurs";
		//convert string into bytes
		byte b[]= s.getBytes(); 
		//Writes bytes into the file
		fout.write(b);
		//Closes the file
		fout.close(); 
		//
		System.out.println("success..."); //Display message for Successful Execution of the pgm on console
		}
		//Catch block to handle if error is occurs
		catch(Exception e) 
		{
			//Printing the Exception
			System.out.println(e);
	    } 
	}

}
