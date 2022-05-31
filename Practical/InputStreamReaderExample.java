package corejava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputStreamReaderExample {

	public static void main(String[] args)throws Exception
	{
		// To read from the created file
		InputStreamReader r = new InputStreamReader(System.in);
		// Creates a BufferedReader
    	BufferedReader br = new BufferedReader(r);
    	//Taking input from the user
    	System.out.println("Enter your Name:");
    	String name = br.readLine();
    	//Printing the input value
    	System.out.println("Welcome " +  name);
	}

}
